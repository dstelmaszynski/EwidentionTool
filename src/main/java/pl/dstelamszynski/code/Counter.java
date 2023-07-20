package pl.dstelamszynski.code;

import java.util.Collection;

public class Counter {
    WorkdayFind workdayFind = new WorkdayFind();


//    int searchedMonthAsInt = workdayFind.leapYearCheck.dataProvider.listDateParams.get(1);
//    Boolean leapYearResultFromList = workdayFind.leapYearCheck.dataProvider.boolResultLeapYear.get(0);
//


    int mileAgeCounter(Collection<Integer> valuesOfMap) {
        int mileAgePartialSum = 0;
        for (Integer value : valuesOfMap) {
            int mileAgePartialSumTemp = value;
            mileAgePartialSum = mileAgePartialSum + mileAgePartialSumTemp;
            System.out.println("Sum: " + mileAgePartialSum);
        }
        return mileAgePartialSum;
    }
}


