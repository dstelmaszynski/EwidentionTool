package pl.dstelamszynski.code;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        WorkdayFind workdayFind = new WorkdayFind();

        workdayFind.leapYearCheck.leapYearChecker();
        workdayFind.leapYearCheck.dataProvider.monthAsIntScanner();
        workdayFind.leapYearCheck.dataProvider.dayScanner();



        List<Integer> dateParams = workdayFind.leapYearCheck.dataProvider.listDateParams;
        System.out.println(dateParams);


        //TODO monthNameScanner() call

//        System.out.println("\n Month length: " + month.length());


        workdayFind.workdayFinder();

        Counter counter = new Counter();
//        System.out.println("Please enter value: mileage at petrol!");
//        int mileAgeInputEnd = LeapYearCheck.dataProvider.mileAgeScanner();
//        System.out.println("Please enter value: mileage at the beginning!");
//        int mileAgeInputStart = LeapYearCheck.dataProvider.mileAgeScanner();
//        int partialResult = counter.mileAgeCounter(mileAgeInputEnd, mileAgeInputStart);
//        System.out.println(partialResult);


//        System.out.println("Days in month: " +);


    }


}
