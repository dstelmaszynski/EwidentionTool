package pl.dstelamszynski.code;

import java.math.BigDecimal;
import java.util.*;

public class DataProvider implements ScannerInterface {

    Scanner scanner = new Scanner(System.in);

    List<Integer> listYearMonthDay = new ArrayList<>();
    List<Integer> dayOffList = new ArrayList<>();
    Map<Integer, Integer> dayAndMileage = new LinkedHashMap<>();
    List<Object> days_gasolineAmount_mileAge_cost = new ArrayList<>();
    Map<Integer, BigDecimal> dayAndCostInvoice = new LinkedHashMap<>();
    Map<Integer, Double> keyDayValueAmountOfGasoline = new LinkedHashMap<>();


    int yearInput;
    int monthInput;
    int firstDayOfTheMonth = 1;

    int holiday;
    int initialMileage;
    int mileAge;
    int numberOfInvoices;

    @Override
    public void initialMileageScanner() {
        System.out.println("Please enter mileage of the first day of the month!");
        initialMileage = scanner.nextInt();
    }

    @Override
    public void numberOfInvoicesScanner() {
        System.out.println("Please enter number of invoices this month!");
        numberOfInvoices = scanner.nextInt();
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
    public void mileAgeScanner() {
        System.out.println("Please enter mileage as number!");
        mileAge = scanner.nextInt();
    }

    public void day_amountOfGasoline_mileAge_costScanner() {
        days_gasolineAmount_mileAge_cost.clear();
        System.out.println("Please enter fueling day as a number!");
        Integer dayValueInt = scanner.nextInt();
        System.out.println("Please enter amount of gasoline as a double!");
        Double amountOfPetrolDouble = scanner.nextDouble();
        mileAgeScanner();
        System.out.println("Please enter cost in PLN!");
        BigDecimal gasolineCostBD = scanner.nextBigDecimal();

        dayAndCostInvoice.put(dayValueInt, gasolineCostBD);
        keyDayValueAmountOfGasoline.put(dayValueInt, amountOfPetrolDouble);

        days_gasolineAmount_mileAge_cost.add(0, dayValueInt);
        days_gasolineAmount_mileAge_cost.add(1, amountOfPetrolDouble);
        days_gasolineAmount_mileAge_cost.add(2, mileAge);
        days_gasolineAmount_mileAge_cost.add(3, gasolineCostBD);
    }

    @Override
    public void firstDayOfMonth() {
        listYearMonthDay.add(firstDayOfTheMonth);
        System.out.println("listDateParams result: " + listYearMonthDay);
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

    public int getInitialMileage() {
        return initialMileage;
    }

    public List<Object> getDays_gasolineAmount_mileAge_cost() {
        return days_gasolineAmount_mileAge_cost;
    }

    public int getNumberOfInvoices() {
        return numberOfInvoices;
    }
}

