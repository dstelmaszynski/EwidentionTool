package pl.dstelamszynski.code;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

public class Counter {
    WorkdayFind workdayFind = new WorkdayFind();
    int countedDaysBetweenFuelling = 0;
    int tempStartCountFromDay = 0;
    int tempMileageAfterFuelling = 0;

    public void mileAgeCounterBeginOfTheMonth(Map<Integer, Integer> mapWithDaysAndMileage, int initialMileage,
                                              List<Object> day_amount_mileAge_cost) {

        Integer mileageWhenFuelling = (Integer) day_amount_mileAge_cost.get(2);
        tempMileageAfterFuelling = mileageWhenFuelling;
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
        tempStartCountFromDay = daysBetweenFuellingOriginal + 1;
    }

    public void mileAgeCounter(Map<Integer, Integer> mapWithDaysAndMileage, int tempStartCountFromDay,
                               int tempMileageAfterFuelling, List<Object> day_amount_mileAge_cost) {

        Integer mileageWhenFuelling = (Integer) day_amount_mileAge_cost.get(2);
        BigDecimal mileAge = BigDecimal.valueOf(mileageWhenFuelling);
        Integer daysBetweenFuellingOriginal = (Integer) day_amount_mileAge_cost.get(0);
        Integer daysBetweenFuellingFixed = (Integer) day_amount_mileAge_cost.get(0);
//        Integer daysSubtractedThisPeriod;

        for (int i = tempStartCountFromDay; i <= daysBetweenFuellingOriginal; i++) {
            Integer valueOfMap = mapWithDaysAndMileage.get(i);
            if (valueOfMap.equals(999)) {
//                tempStartCountFromDay--;
                daysBetweenFuellingFixed--;
            }
            countedDaysBetweenFuelling = daysBetweenFuellingFixed - tempStartCountFromDay + 1;
        }

        BigDecimal days = BigDecimal.valueOf(countedDaysBetweenFuelling);
        BigDecimal mileAgeBetweenLastFuelling = mileAge.subtract(BigDecimal.valueOf(tempMileageAfterFuelling));
        BigDecimal partialMileageResult = (
                mileAgeBetweenLastFuelling.add(BigDecimal.valueOf(5)).divide(days, 2, RoundingMode.HALF_UP));

        for (int i = tempStartCountFromDay; i <= daysBetweenFuellingOriginal; i++) {
            if (mapWithDaysAndMileage.get(i).equals(999)) {
                continue;
            }
            mapWithDaysAndMileage.replace(i, partialMileageResult.intValue());
        }
        tempStartCountFromDay = daysBetweenFuellingOriginal + 1;
    }
}



