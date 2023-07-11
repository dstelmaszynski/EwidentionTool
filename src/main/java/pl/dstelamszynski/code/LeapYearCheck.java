package pl.dstelamszynski.code;

public class LeapYearCheck {
    static void leapYearChecker(int yearValue) {
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
