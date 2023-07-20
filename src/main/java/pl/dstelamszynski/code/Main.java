package pl.dstelamszynski.code;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Counter counter = new Counter();

        //TODO leapYearChecker() call
        counter.workdayFind.leapYearCheck.mapWithDaysAndMileageInitFiller();

        counter.workdayFind.leapYearCheck.dataProvider.firstDayOfMonth();
        counter.workdayFind.leapYearCheck.dataProvider.holidaysFinder();
        List<Integer> dayOffList = counter.workdayFind.leapYearCheck.dataProvider.dayOffList;
        System.out.println("Those are my holidays: " + dayOffList);

        counter.workdayFind.leapYearCheck.dataProvider.fuelingDayScanner();


        Map<Integer, Integer> dayAndMileageValues = counter.workdayFind.leapYearCheck.dataProvider.dayAndMileage;
        Collection<Integer> values = dayAndMileageValues.values();
        counter.mileAgeCounter(values);
//        for (Integer value : values) {
//           int biggerValueOfMileAge = value;
//        }
        System.out.println("Map filled with values: " + dayAndMileageValues);
//
//        counter.mileAgeCounter(counter.workdayFind.leapYearCheck.dataProvider.dayAndMileage.values())


        List<Integer> dateParams = counter.workdayFind.leapYearCheck.dataProvider.listDateParams;
        System.out.println(dateParams);


        //TODO monthNameScanner() call

//        System.out.println("\n Month length: " + month.length());


        counter.workdayFind.workdayFinder();

//        System.out.println("Please enter value: mileage at petrol!");
//        int mileAgeInputEnd = LeapYearCheck.dataProvider.mileAgeScanner();
//        System.out.println("Please enter value: mileage at the beginning!");
//        int mileAgeInputStart = LeapYearCheck.dataProvider.mileAgeScanner();
//        int partialResult = counter.mileAgeCounter(mileAgeInputEnd, mileAgeInputStart);
//        System.out.println(partialResult);


//        System.out.println("Days in month: " +);


    }


}
