package pl.dstelamszynski.code;

import java.math.BigDecimal;
import java.util.*;

public class DataProvider implements ScannerInterface {

    Scanner scanner = new Scanner(System.in);

    List<Integer> listYearMonthDay = new ArrayList<>();
    List<Integer> dayOffList = new ArrayList<>();
    Map<Integer, Integer> dayAndMileage = new LinkedHashMap<>();
    List<Object> days_gasolineAmount_mileAge_cost = new ArrayList<>();

    int yearInput;
    int monthInput;
    String isMonthFromLeapYear;
    int firstDayOfTheMonth = 1;

    int holiday;
    int initialMileage;
    int mileAge;

    @Override
    public int initialMileageScanner() {
        System.out.println("Please enter mileage of the first day of the month!");
        initialMileage = scanner.nextInt();
        return initialMileage;
    }

    @Override
    public int yearScanner() {
        System.out.println("Please enter year YYYY!");
        try {
            yearInput = scanner.nextInt();
        } catch (Exception e) {
            throw new InputMismatchException("Wrong input. Try numbers!");
        }
        listYearMonthDay.add(yearInput);
        return yearInput;

    }

    @Override
    public int dayScanner() {
        System.out.println("Please enter day as a number!");
        return scanner.nextInt();
    }

    @Override
    public String yearBooleanScanner() {
        System.out.println("Please type:\n YES if it's leap year\n NO if it's not\n");
        isMonthFromLeapYear = scanner.next();
        return isMonthFromLeapYear;
    }

    @Override
    public void monthAsIntScanner() {
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
        listYearMonthDay.add(monthInput);
    }

    @Override
    public int mileAgeScanner() {
        System.out.println("Please enter mileage as number!");
        mileAge = scanner.nextInt();
        return mileAge;
    }

    public List<Object> day_amountOfGasoline_mileAge_costScanner() {
        days_gasolineAmount_mileAge_cost.clear();
        System.out.println("Please enter fueling day as a number!");
        Integer dayValueInt = scanner.nextInt();
        System.out.println("Please enter amount of gasoline as a double!");
        Double amountOfPetrolDouble = scanner.nextDouble();
        Integer mileAgeValueInt = mileAgeScanner();
        System.out.println("Please enter cost in BD!");
        BigDecimal gasolineCostBD = scanner.nextBigDecimal();

//        dayAndMileage.put(dayValueInt, mileAgeValueInt);
        days_gasolineAmount_mileAge_cost.add(0, dayValueInt);
        days_gasolineAmount_mileAge_cost.add(1, amountOfPetrolDouble);
        days_gasolineAmount_mileAge_cost.add(2, mileAge);
        days_gasolineAmount_mileAge_cost.add(3, gasolineCostBD);
        return days_gasolineAmount_mileAge_cost;
    }

    @Override
    public int firstDayOfMonth() {
        listYearMonthDay.add(firstDayOfTheMonth);
        System.out.println("listDateParams result: " + listYearMonthDay);
        return firstDayOfTheMonth;
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
                    dayAndMileage.put(integer, 999);
                }
            } else {
                return;
            }
        }
    }

    public List<Integer> getListYearMonthDay() {
        return listYearMonthDay;
    }


    public List<Integer> getDayOffList() {
        return dayOffList;
    }

    public Map<Integer, Integer> getDayAndMileage() {
        return dayAndMileage;
    }

    public int getYearInput() {
        return yearInput;
    }

    public int getMonthInput() {
        return monthInput;
    }

    public String getIsMonthFromLeapYear() {
        return isMonthFromLeapYear;
    }

    public int getDayInput() {
        return firstDayOfTheMonth;
    }

    public int getHoliday() {
        return holiday;
    }

    public int getInitialMileage() {
        return initialMileage;
    }

    public int getMileAge() {
        return mileAge;
    }

    public List<Object> getDays_gasolineAmount_mileAge_cost() {
        return days_gasolineAmount_mileAge_cost;
    }
}

