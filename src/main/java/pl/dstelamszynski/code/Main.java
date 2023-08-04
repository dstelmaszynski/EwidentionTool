package pl.dstelamszynski.code;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();

        LeapYearCheck leapYearCheck = counter.workdayFind.leapYearCheck;
        leapYearCheck.dataProvider.initialMileageScanner();
        leapYearCheck.mapWithDaysAndMileageInitFiller();
        leapYearCheck.dataProvider.firstDayOfMonth();

        counter.workdayFind.dayOfTheWeekInOrderInput();
//        System.out.println("dayOfTheWeekInMonth: " + counter.workdayFind.dayOfTheWeekInMonth);
        counter.workdayFind.workdayFinder(leapYearCheck.dataProvider.getDayAndMileage());
//        System.out.println("DayAndMileage: " + leapYearCheck.dataProvider.getDayAndMileage());


        leapYearCheck.dataProvider.firstDayOfMonth();
        leapYearCheck.dataProvider.holidaysFinder();
        List<Integer> dayOffList = leapYearCheck.dataProvider.getDayOffList();
        System.out.println("Those are my holidays: " + dayOffList);
//        System.out.println("Updated DayAndMileage: " + leapYearCheck.dataProvider.getDayAndMileage());

        leapYearCheck.dataProvider.numberOfInvoicesScanner();
        int numberOfInvoices = leapYearCheck.dataProvider.getNumberOfInvoices() - 1;

        leapYearCheck.dataProvider.day_amountOfGasoline_mileAge_costScanner();
//        System.out.println("Days_gasolineAmount_mileAge_cost" + leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
        counter.mileAgeCounterBeginOfTheMonth(
                leapYearCheck.dataProvider.getDayAndMileage(),
                leapYearCheck.dataProvider.getInitialMileage(),
                leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
//        System.out.println("Updated DayAndMileage init version " + leapYearCheck.dataProvider.getDayAndMileage());


        for (int i = 1; i <= numberOfInvoices; i++) {
            leapYearCheck.dataProvider.day_amountOfGasoline_mileAge_costScanner();
//            System.out.println("Days_gasolineAmount_mileAge_cost" + leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
            counter.mileAgeCounter(
                    leapYearCheck.dataProvider.getDayAndMileage(),
                    counter.tempStartCountFromDay,
                    counter.tempMileageAfterFuelling,
                    leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
//            System.out.println("Updated DayAndMileage number: " + i + " " + leapYearCheck.dataProvider.getDayAndMileage());
        }
        counter.dayAndMileageMapCleaner(leapYearCheck.dataProvider.getDayAndMileage());
        counter.withoutTaxPayment(leapYearCheck.dataProvider.dayAndCostInvoice);
        leapYearCheck.dataProvider.getDayAndMileage().forEach((k, v) -> System.out.println("Day: " + k + ", mileage: " + v));


        ToFileSaver toFileSaver = new ToFileSaver();
        toFileSaver.fileSaver(leapYearCheck.dataProvider.getDayAndMileage());


    }


}
