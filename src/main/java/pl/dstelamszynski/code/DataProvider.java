package pl.dstelamszynski.code;

import java.util.*;

public class DataProvider implements ScannerInterface {
    Scanner scanner = new Scanner(System.in);
    List<Integer> listDateParams = new ArrayList<>();
    HashMap<Integer, Boolean> someMap = new HashMap<>();
    int yearInput;
    int monthInput;
    String isMonthFromLeapYear;
    int dayInput;

    @Override
    public int yearScanner() {
        System.out.println("Please enter year YYYY!");
        try {
            yearInput = scanner.nextInt();
        } catch (Exception e) {
            throw new InputMismatchException("Wrong input. Try numbers!");
        }
        listDateParams.add(yearInput);
        return yearInput;

    }

    @Override
    public String yearBooleanScanner() {
        System.out.println("Please type:\n YES if it's leap year\n NO if it's not\n");
        isMonthFromLeapYear = scanner.next();
        return isMonthFromLeapYear;
    }

    @Override
    public int monthAsIntScanner() {
        System.out.println("Please enter month, as number!\n");
        System.out.print("""
                1. January
                2. February
                3. March
                4. April
                5. May
                6. June
                7. July
                8. August
                9. September
                10. October
                11. November
                12. December
                """);
        monthInput = scanner.nextInt();
        listDateParams.add(monthInput);
        return monthInput;
    }

    @Override
    public int mileAgeScanner() {
        return scanner.nextInt();
    }

    @Override
    public int fuelingDayScanner() {
        return scanner.nextInt();
    }

    @Override
    public int dayScanner() {
        System.out.println("Please enter day of the month, as number!");
        dayInput = scanner.nextInt();
        listDateParams.add(dayInput);
        return dayInput;
    }

}
