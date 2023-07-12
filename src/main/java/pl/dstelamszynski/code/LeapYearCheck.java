package pl.dstelamszynski.code;

import java.time.Month;

public class LeapYearCheck {
    DataProvider dataProvider = new DataProvider();
    public void leapYearChecker() {
        int yearScannerValue = dataProvider.yearScanner();
        if ((yearScannerValue % 4 == 0) && (yearScannerValue % 100 != 0)) {
            System.out.println("It's leap year! Type YES!");
        } else if (yearScannerValue % 400 == 0) {
            System.out.println("It's leap year! Type YES!");
        } else {
            System.out.println("Nope, it's not leap year! Type NO!");
        }
    }

    public void monthValidation(){
        String monthValue = dataProvider.yearBooleanScanner().toUpperCase();
        if (monthValue == "YES"){
            monthValue = String.valueOf(Month.valueOf(monthValue).length(true));
        }else if(monthValue == "NO") {
            monthValue = String.valueOf(Month.valueOf(monthValue).length(false));
        }
    }


}
