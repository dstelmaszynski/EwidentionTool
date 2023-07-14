package pl.dstelamszynski.code;

import java.time.Month;
import java.util.HashMap;

public class LeapYearCheck {
    DataProvider dataProvider = new DataProvider();



    public int leapYearChecker() {
        int yearScannerValue = dataProvider.yearScanner();
        if ((yearScannerValue % 4 == 0) && (yearScannerValue % 100 != 0)) {
            System.out.println("It's leap year! Type YES when asked!");
        } else if (yearScannerValue % 400 == 0) {
            System.out.println("It's leap year! Type YES when asked!");
        } else {
            System.out.println("Nope, it's not leap year! Type NO when asked!");
        }
        return yearScannerValue;
    }

    public void monthValidation() {
        dataProvider.monthAsIntScanner();


        String isLeapYearInputValue = dataProvider.yearBooleanScanner().toUpperCase();
        if (isLeapYearInputValue == ("YES")) {
            dataProvider.isMonthFromLeapYear = String.valueOf(Month.valueOf(isLeapYearInputValue).length(true));
            dataProvider.someMap.put(dataProvider.listDateParams.get(1), true);
        } else if (isLeapYearInputValue == ("NO")) {
            dataProvider.isMonthFromLeapYear = String.valueOf(Month.valueOf(isLeapYearInputValue).length(false));
           dataProvider.someMap.put(dataProvider.listDateParams.get(1), false);

        }

//        isLeapYearValidated = Boolean.parseBoolean(isLeapYearInputValue);
//        someMap.put(dataProvider.listDateParams.get(1), isLeapYearValidated);

    }


}
