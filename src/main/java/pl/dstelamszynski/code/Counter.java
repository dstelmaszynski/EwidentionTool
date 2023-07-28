package pl.dstelamszynski.code;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

public class Counter {
    WorkdayFind workdayFind = new WorkdayFind();
    int countedDaysBetweenFuelling = 0;
    public void mileAgeCounter(Map<Integer, Integer> mapWithDaysAndMileage, int initialMileage, List<Object> day_amount_mileAge_cost) {
        Integer mileageWhenFuelling = (Integer) day_amount_mileAge_cost.get(2);
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
        BigDecimal partialMileageResult = (mileAge.add(BigDecimal.valueOf(5)).divide(days, 2, RoundingMode.HALF_UP));

        for (int i = 1; i <= daysBetweenFuellingOriginal; i++) {
            if (mapWithDaysAndMileage.get(i).equals(999)) {
                continue;
            }
            mapWithDaysAndMileage.replace(i, partialMileageResult.intValue());
        }
    }

    //TODO normal mileAgeCounter need to impl. proper logic, version with init param works 28.07
    void mileAgeCounter(Map<Integer, Object> tempMapWithDayAndMileage, Map<Integer, Integer> finalMapWithDayAndMileage) {
        tempMapWithDayAndMileage.forEach((k, v) -> {
            int dayNewValue = k;
            Integer mileageNewValue = (Integer) v;
            finalMapWithDayAndMileage.forEach((k2, v2) -> {
                int dayOldValue = k2;
                int mileageOldValue = v2;
                finalMapWithDayAndMileage.replace(dayOldValue, dayNewValue);
                finalMapWithDayAndMileage.replace(mileageOldValue, mileageNewValue);
            });

        });
    }
}



