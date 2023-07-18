package pl.dstelamszynski.code;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Counter counter = new Counter();

        counter.workdayFind.leapYearCheck.leapYearChecker();
        counter.workdayFind.leapYearCheck.dataProvider.monthAsIntScanner();
        counter.workdayFind.leapYearCheck.dataProvider.dayScanner();
        counter.workdayFind.leapYearCheck.dataProvider.holidaysFinder();
        List<Integer> dayOffList = counter.workdayFind.leapYearCheck.dataProvider.dayOffList;
        System.out.println("Those are my holidays: " + dayOffList);


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
