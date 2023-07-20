package pl.dstelamszynski.code;

import java.time.Month;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeapYearCheck {
    DataProvider dataProvider = new DataProvider();
    boolean leapVal;

    Map<Integer, Integer> finalMap = new LinkedHashMap<>();

    public void mapWithDaysAndMileageInitFiller() {
        leapYearChecker();
        dataProvider.monthAsIntScanner();

        Month month = Month.of(dataProvider.listDateParams.get(1));
        int monthLength = month.length(leapVal);
        for (int i = 1; i <= monthLength; i++) {
            finalMap.put(i, 0);
        }
        System.out.println("Map init version: " + finalMap);
    }

    public boolean leapYearChecker() {
        int yearScannerValue = dataProvider.yearScanner();
        if ((yearScannerValue % 4 == 0) && (yearScannerValue % 100 != 0)) {
            System.out.println("It's leap year!");
            leapVal = true;
        } else if (yearScannerValue % 400 == 0) {
            System.out.println("It's leap year!");
            leapVal = true;
        } else {
            System.out.println("Nope, it's not leap year!");
            leapVal = false;
        }
        return leapVal;
    }
}

