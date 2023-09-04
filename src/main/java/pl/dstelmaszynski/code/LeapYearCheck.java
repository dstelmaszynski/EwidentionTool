package pl.dstelmaszynski.code;

import java.time.Month;

public class LeapYearCheck {
    DataProvider dataProvider = new DataProvider();
    boolean leapYearCheckValue;

    public void mapWithDaysAndMileageInitFiller() {
        leapYearChecker();
        dataProvider.monthAsIntScanner();
        Month month = Month.of(dataProvider.listYearMonthDay.get(1));
        int monthLength = month.length(leapYearCheckValue);
        for (int i = 1; i <= monthLength; i++) {
            dataProvider.getDayAndMileage().put(i, 0);
        }
    }

    public void leapYearChecker() {
        int yearScannerValue = dataProvider.yearScanner();
        if ((yearScannerValue % 4 == 0) && (yearScannerValue % 100 != 0)) {
            System.out.println("It's leap year!");
            leapYearCheckValue = true;
        } else if (yearScannerValue % 400 == 0) {
            System.out.println("It's leap year!");
            leapYearCheckValue = true;
        } else {
            System.out.println("Nope, it's not leap year!");
            leapYearCheckValue = false;
        }
    }

    public boolean isLeapYearCheckValue() {
        return leapYearCheckValue;
    }
}

