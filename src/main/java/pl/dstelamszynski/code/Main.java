package pl.dstelamszynski.code;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Counter counter = new Counter();

        //TODO leapYearChecker() call
        LeapYearCheck leapYearCheck = counter.workdayFind.leapYearCheck;
        leapYearCheck.dataProvider.initialMileageScanner();

        leapYearCheck.mapWithDaysAndMileageInitFiller();

//        Map<Integer, Integer> dayAndMileageValues = leapYearCheck.getTempMapWithInitialVal();
//        counter.mileAgeCounter(dayAndMileageValues, leapYearCheck.dataProvider.getInitialMileage());
//        System.out.println("Map after filling with first mileage: " + dayAndMileageValues);


        leapYearCheck.dataProvider.firstDayOfMonth();
        leapYearCheck.dataProvider.holidaysFinder();
        List<Integer> dayOffList = leapYearCheck.dataProvider.getDayOffList();
        System.out.println("Those are my holidays: " + dayOffList);

        leapYearCheck.dataProvider.fuelingDayAndMileageScanner();

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
