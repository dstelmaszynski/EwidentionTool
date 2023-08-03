package pl.dstelamszynski.code;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Counter {
    WorkdayFind workdayFind = new WorkdayFind();
    int countedDaysBetweenFuelling = 0;
    List<Integer> tempStartCountFromDay = new ArrayList<>();
    List<Integer> tempMileageAfterFuelling = new ArrayList<>();

    public void mileAgeCounterBeginOfTheMonth(Map<Integer, Integer> mapWithDaysAndMileage, int initialMileage,
                                              List<Object> day_amount_mileAge_cost) {

        Integer mileageWhenFuelling = (Integer) day_amount_mileAge_cost.get(2);
        tempMileageAfterFuelling.add(mileageWhenFuelling);
        BigDecimal mileAge = BigDecimal.valueOf(mileageWhenFuelling);
        Integer daysBetweenFuellingOriginal = (Integer) day_amount_mileAge_cost.get(0);
        Integer daysBetweenFuellingFixed = (Integer) day_amount_mileAge_cost.get(0);

        for (int i = 1; i <= daysBetweenFuellingOriginal; i++) {
            Integer valueOfMap = mapWithDaysAndMileage.get(i);
            if (valueOfMap.equals(999)) {
                daysBetweenFuellingFixed--;
            }
            countedDaysBetweenFuelling = daysBetweenFuellingFixed;
        }

        BigDecimal days = BigDecimal.valueOf(countedDaysBetweenFuelling);
        BigDecimal mileAgeBetweenFirstAndFuelling = mileAge.subtract(BigDecimal.valueOf(initialMileage));
        BigDecimal partialMileageResult = (
                mileAgeBetweenFirstAndFuelling.add(BigDecimal.valueOf(5)).divide(days, 2, RoundingMode.HALF_UP));

        for (int i = 1; i <= daysBetweenFuellingOriginal; i++) {
            if (mapWithDaysAndMileage.get(i).equals(999)) {
                continue;
            }
            mapWithDaysAndMileage.replace(i, partialMileageResult.intValue());
        }
        tempStartCountFromDay.add(daysBetweenFuellingOriginal + 1);
    }

    public void mileAgeCounter(Map<Integer, Integer> mapWithDaysAndMileage, List<Integer> tempStartCountFromDay,
                               List <Integer> tempMileageAfterFuelling, List<Object> day_amount_mileAge_cost) {

        Integer mileageWhenFuelling = (Integer) day_amount_mileAge_cost.get(2);
        BigDecimal mileAge = BigDecimal.valueOf(mileageWhenFuelling);
        Integer daysBetweenFuellingOriginal = (Integer) day_amount_mileAge_cost.get(0);
        Integer daysBetweenFuellingFixed = (Integer) day_amount_mileAge_cost.get(0);

        for (int i = tempStartCountFromDay.get(0); i <= daysBetweenFuellingOriginal; i++) {
            Integer valueOfMap = mapWithDaysAndMileage.get(i);
            if (valueOfMap.equals(999)) {
                daysBetweenFuellingFixed--;
            }
            countedDaysBetweenFuelling = (daysBetweenFuellingFixed - tempStartCountFromDay.get(0)) + 1;
        }

        BigDecimal days = BigDecimal.valueOf(countedDaysBetweenFuelling);
        BigDecimal mileAgeBetweenLastFuelling = mileAge.subtract(BigDecimal.valueOf(tempMileageAfterFuelling.get(0)));
        BigDecimal partialMileageResult = (
                mileAgeBetweenLastFuelling.add(BigDecimal.valueOf(5)).divide(days, 2, RoundingMode.HALF_UP));

        for (int i = tempStartCountFromDay.get(0); i <= daysBetweenFuellingOriginal; i++) {
            if (mapWithDaysAndMileage.get(i).equals(999)) {
                continue;
            }
            mapWithDaysAndMileage.replace(i, partialMileageResult.intValue());
        }
        tempStartCountFromDay.clear();
        tempStartCountFromDay.add(daysBetweenFuellingOriginal + 1);
        tempMileageAfterFuelling.clear();
        tempMileageAfterFuelling.add(mileAge.intValue());
    }

    public void dayAndMileageMapCleaner(Map<Integer, Integer> dayAndMileage){
        for (int i = 1; i < dayAndMileage.size(); i++) {
            if(dayAndMileage.get(i).equals(999)){
                dayAndMileage.replace(i, 999, 0);
            }
        }
    }

    public void withoutTaxPayment(Map<Integer, BigDecimal> dayAndCostInvoice){
        BigDecimal taxValue = BigDecimal.valueOf(0.23);
        System.out.println("Costs before tax: ");
        dayAndCostInvoice.forEach((k, v) -> System.out.println("Day: " + k + ", cost: " + v + " zł"));
        System.out.println();
        System.out.println("Costs after tax: ");
        dayAndCostInvoice.forEach((k, v) -> System.out.println("Day: " + k + ", cost: " + v.subtract(v.multiply(taxValue)) + " zł"));
        System.out.println();

        Map<Integer, Double> keyDayValueAmountOfGasoline = workdayFind.leapYearCheck.dataProvider.keyDayValueAmountOfGasoline;
        System.out.println("Gasoline summary: ");
        keyDayValueAmountOfGasoline.forEach((k,v) -> System.out.println("Day: " + k + ", gasoline amount: " + v));
        System.out.println("------------------------------------------------------------------------------------");
    }
}



