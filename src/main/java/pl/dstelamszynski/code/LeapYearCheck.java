package pl.dstelamszynski.code;

public class LeapYearCheck {
    DataProvider dataProvider = new DataProvider();


    public int leapYearChecker() {
        int yearScannerValue = dataProvider.yearScanner();
        if ((yearScannerValue % 4 == 0) && (yearScannerValue % 100 != 0)) {
            System.out.println("It's leap year!");
            dataProvider.boolResultLeapYear.add(true);
        } else if (yearScannerValue % 400 == 0) {
            System.out.println("It's leap year!");
            dataProvider.boolResultLeapYear.add(true);
        } else {
            System.out.println("Nope, it's not leap year!");
            dataProvider.boolResultLeapYear.add(false);
        }
        return yearScannerValue;
    }


}

