package pl.dstelamszynski.code;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        LeapYearCheck leapYearCheck = counter.workdayFind.leapYearCheck;
        leapYearCheck.dataProvider.initialMileageScanner();
        leapYearCheck.mapWithDaysAndMileageInitFiller();
        leapYearCheck.dataProvider.firstDayOfMonth();

        counter.workdayFind.dayOfTheWeekInOrderInput();
        System.out.println("dayOfTheWeekInMonth: " + counter.workdayFind.dayOfTheWeekInMonth);
        counter.workdayFind.workdayFinder(leapYearCheck.dataProvider.getDayAndMileage());
        System.out.println("DayAndMileage: " + leapYearCheck.dataProvider.getDayAndMileage());


        leapYearCheck.dataProvider.firstDayOfMonth();
        leapYearCheck.dataProvider.holidaysFinder();
        List<Integer> dayOffList = leapYearCheck.dataProvider.getDayOffList();
        System.out.println("Those are my holidays: " + dayOffList);
        System.out.println("Updated DayAndMileage: " + leapYearCheck.dataProvider.getDayAndMileage());

        leapYearCheck.dataProvider.day_amountOfGasoline_mileAge_costScanner();
        System.out.println("Days_gasolineAmount_mileAge_cost" + leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
        counter.mileAgeCounterBeginOfTheMonth(
                leapYearCheck.dataProvider.getDayAndMileage(),
                leapYearCheck.dataProvider.getInitialMileage(),
                leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
        System.out.println("Updated DayAndMileage 2: " + leapYearCheck.dataProvider.getDayAndMileage());


        leapYearCheck.dataProvider.day_amountOfGasoline_mileAge_costScanner();
        System.out.println("Days_gasolineAmount_mileAge_cost" + leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
        counter.mileAgeCounter(
                leapYearCheck.dataProvider.getDayAndMileage(),
                counter.tempStartCountFromDay,
                counter.tempMileageAfterFuelling,
                leapYearCheck.dataProvider.getDays_gasolineAmount_mileAge_cost());
        System.out.println("Updated DayAndMileage 3: " + leapYearCheck.dataProvider.getDayAndMileage());

//        counter.mileAgeCounter(leapYearCheck.getTempMapWithInitialVal(), leapYearCheck.getFinalMap());
//        System.out.println("Map after second filing: " + dayAndMileageValues);
//        counter.mileAgeCounter(counter.workdayFind.leapYearCheck.dataProvider.getDayAndMileage());


//        counter.mileAgeCounter(keySet);
//        for (Integer value : keySet) {
//           int biggerValueOfMileAge = value;
//        }
//        System.out.println("Map filled with keySet: " + dayAndMileageValues);
//
//        counter.mileAgeCounter(counter.workdayFind.leapYearCheck.dataProvider.dayAndMileage.keySet())


        List<Integer> dateParams = leapYearCheck.dataProvider.getListYearMonthDay();
        System.out.println(dateParams);


        //TODO monthNameScanner() call

//        System.out.println("\n Month length: " + month.length());


//        counter.workdayFind.workdayFinder();

//        System.out.println("Please enter value: mileage at petrol!");
//        int mileAgeInputEnd = LeapYearCheck.dataProvider.mileAgeScanner();
//        System.out.println("Please enter value: mileage at the beginning!");
//        int mileAgeInputStart = LeapYearCheck.dataProvider.mileAgeScanner();
//        int partialResult = counter.mileAgeCounter(mileAgeInputEnd, mileAgeInputStart);
//        System.out.println(partialResult);


//        System.out.println("Days in month: " +);


    }


}
