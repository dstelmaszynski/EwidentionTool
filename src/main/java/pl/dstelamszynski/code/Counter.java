package pl.dstelamszynski.code;

import java.util.Map;

public class Counter {
    WorkdayFind workdayFind = new WorkdayFind();


    //TODO null pointer + nie zrobiona metoda dodawania 0 poza 1 dniem miesiaca
    public void mileAgeCounter(Map<Integer, Integer> mapWithDaysAndMileage, int initialMileage, int dayOfFuelling) {
        mapWithDaysAndMileage.replace(dayOfFuelling, initialMileage);

//        if (mapWithDaysAndMileage.containsValue("no value")) {
//            mapWithDaysAndMileage.forEach((d, m) -> {
//                        mapWithDaysAndMileage.replace(d, "no value", String.valueOf(0));
//                        mapWithDaysAndMileage.put(1, String.valueOf(initialMileage));
//                    }
//            );
//        }

    }

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

//        Set<Integer> dayOfMonthToPutKeyVal = tempMapWithDayAndMileage.keySet();
//        tempMapWithDayAndMileage.p
//        List<Integer> daysToPutIntoTheMap = dayOfMonthToPutKeyVal.stream().toList();
//        Stream.of(tempMapWithDayAndMileage).mapToInt((k, v) -> {k.keySet(), })
//
//        tempMapWithDayAndMileage.put()
//        tempMapWithDayAndMileage.put(daysToPutIntoTheMap.get(0), tempMapWithDayAndMileage.valu)
//        int mileAgePartialSum = 0;
//        for (Integer value : valuesOfMap) {
//            int mileAgePartialSumTemp = value;
//            mileAgePartialSum = mileAgePartialSum + mileAgePartialSumTemp;
//            System.out.println("Sum: " + mileAgePartialSum);
//        }
//        return mileAgePartialSum;
//        }
//        }


