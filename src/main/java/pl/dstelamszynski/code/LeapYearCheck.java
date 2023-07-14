package pl.dstelamszynski.code;

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
        if (isLeapYearInputValue.equals("YES")) {
            dataProvider.boolResultLeapYear.add(true);
        } else if (isLeapYearInputValue.equals("NO")) {
           dataProvider.boolResultLeapYear.add(false);

        }

//        isLeapYearValidated = Boolean.parseBoolean(isLeapYearInputValue);
//        someMap.put(dataProvider.listDateParams.get(1), isLeapYearValidated);

    }


}
