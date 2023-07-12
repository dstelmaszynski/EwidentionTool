package pl.dstelamszynski.code;

import java.time.Month;

public class LeapYearCheck {
    DataProvider dataProvider = new DataProvider();
    public void leapYearChecker() {
        int yearScannerValue = dataProvider.yearScanner();
        if ((yearScannerValue % 4 == 0) && (yearScannerValue % 100 != 0)) {
            System.out.println("It's leap year! Type YES when asked!");
        } else if (yearScannerValue % 400 == 0) {
            System.out.println("It's leap year! Type YES when asked!");
        } else {
            System.out.println("Nope, it's not leap year! Type NO when asked!");
        }
    }

    public boolean monthValidation(){
        boolean isMonthFromLeapYear = false;
        String monthValue = dataProvider.yearBooleanScanner().toUpperCase();
        if (monthValue == "YES"){
            isMonthFromLeapYear = Boolean.parseBoolean(String.valueOf(Month.valueOf(monthValue).length(true)));
        }else if(monthValue == "NO") {
            isMonthFromLeapYear = Boolean.parseBoolean(String.valueOf(Month.valueOf(monthValue).length(false)));
        }
        return isMonthFromLeapYear;
    }


}
