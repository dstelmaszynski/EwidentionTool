package pl.dstelamszynski.code;

public class Main {
    public static void main(String[] args) {

        System.out.println("Is it leap year? Please enter year YYYY!");
        DataProvider dataProvider = new DataProvider();
        int yearValue = dataProvider.year;
        leapYearChecker(yearValue);

//        int monthValue = dataProvider.month.getValue();

        System.out.println("Please enter month!");

//        int lengthLeapYear = dataProvider.month.length(true);
//        int lengthNotLeapYear = dataProvider.month.length(false);


//        System.out.println("Days in month: " +);


    }

    private static void leapYearChecker(int yearValue) {
        int isLeapYear = 1;
        int isNotLeapYear = 0;
        if ((yearValue % 4 == 0) && (yearValue % 100 != 0)) {
            yearValue = isLeapYear;
            System.out.println("It's leap year!");
        } else if (yearValue % 400 == 0) {
            yearValue = isLeapYear;
            System.out.println("It's leap year!");
        } else {
            yearValue = isNotLeapYear;
            System.out.println("Nope, it's not leap year!");
        }
    }
}
