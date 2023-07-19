package pl.dstelamszynski.code;

import java.time.Month;

public class Counter {
    WorkdayFind workdayFind = new WorkdayFind();
//    int searchedMonthAsInt = workdayFind.leapYearCheck.dataProvider.listDateParams.get(1);
//    Boolean leapYearResultFromList = workdayFind.leapYearCheck.dataProvider.boolResultLeapYear.get(0);
//    Month month = Month.of(Month.of(searchedMonthAsInt).length(leapYearResultFromList));



    int mileAgeCounter(int mileAgeEnd, int mileAgeStart) {

        return (mileAgeEnd + 5) - mileAgeStart;
    }


}
