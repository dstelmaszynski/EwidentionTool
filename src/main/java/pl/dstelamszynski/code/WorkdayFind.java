package pl.dstelamszynski.code;

import java.time.Month;

public class WorkdayFind {
    LeapYearCheck leapYearCheck = new LeapYearCheck();

    public void workdayFinder() {

        int searchedMonthAsInt = leapYearCheck.dataProvider.listDateParams.get(1);
        Month month = Month.of(searchedMonthAsInt);
        System.out.println("Again TRUE/FALSE: " + leapYearCheck.dataProvider.boolResultLeapYear);
//        int searchedMonthLength = month.length(leapYearCheck.isLeapYearParam);
//        System.out.println("Month length: " + searchedMonthLength + " days.");

//        LocalDate localDate = LocalDate.of(dataProvider.yearInput, dataProvider.monthInput, dataProvider.dayInput);
//        System.out.println(localDate);

    }
}
