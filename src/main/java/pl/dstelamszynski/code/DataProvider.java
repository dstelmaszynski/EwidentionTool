package pl.dstelamszynski.code;

import java.util.*;

public class DataProvider implements ScannerInterface {
    Scanner scanner = new Scanner(System.in);
    List<Integer> listDateParams = new ArrayList<>();
    List<Boolean> boolResultLeapYear = new ArrayList<>();
    List<Integer> dayOffList = new ArrayList<>();
    Map<Integer, Integer> dayAndMileage = new LinkedHashMap<>();
    int yearInput;
    int monthInput;
    String isMonthFromLeapYear;
    int dayInput;
    int holiday;

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
        System.out.println("Please enter mileage as number!");
        return scanner.nextInt();
    }

    @Override
    public Map<Integer, Integer> fuelingDayScanner() {
        System.out.println("Please enter fueling day as a number!");
        int dayValue = scanner.nextInt();
        int mileAgeValue = mileAgeScanner();
        dayAndMileage.put(dayValue, mileAgeValue);
        return dayAndMileage;
    }

    @Override
    public int firstDayOfMonth() {
        dayInput = 1;
        listDateParams.add(dayInput);
        System.out.println("listDateParams result: " + listDateParams);
        return dayInput;
    }

    @Override
    public void holidaysFinder() {
        System.out.println("Please enter day off as number! Type 0 if there is none!");
        for (int i = 0; i <= 31; i++) {
            holiday = scanner.nextInt();
            if (holiday != 0) {
                System.out.println("Type: 0 if finished or add another day off!");
                dayOffList.add(holiday);
                dayOffList.removeIf(day -> (day.equals(0)));
                for (Integer integer : dayOffList) {
                    dayAndMileage.put(integer, 0);
                }
            } else {
                return;
            }
        }
    }
}
