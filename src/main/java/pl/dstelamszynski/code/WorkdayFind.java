package pl.dstelamszynski.code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class WorkdayFind {

    public static void main(String[] args){
        WorkdayFind workdayFind = new WorkdayFind();
        LeapYearCheck leapYearCheck = workdayFind.leapYearCheck;
        leapYearCheck.dataProvider.initialMileageScanner();
        leapYearCheck.mapWithDaysAndMileageInitFiller();
        leapYearCheck.dataProvider.firstDayOfMonth();

        workdayFind.dayOfTheWeekInOrderInput();
        System.out.println(workdayFind.dayOfTheWeekInMonth);
    }

    LeapYearCheck leapYearCheck = new LeapYearCheck();
    Map<Integer, String> dayOfTheWeekInMonth = new LinkedHashMap<>();
    boolean isWorkingDay;

    public void workdayFinder() {

    }
    public void dayOfTheWeekInOrderInput(){
        List<Integer> listYearMonthDay = leapYearCheck.dataProvider.getListYearMonthDay();
        LocalDate localDate = LocalDate.of(listYearMonthDay.get(0), listYearMonthDay.get(1), listYearMonthDay.get(2));
        DayOfWeek firstDayOfMonthName = DayOfWeek.from(localDate);
        String firstDayOfTheWeekParam = firstDayOfMonthName.toString();
        dayOfTheWeekInMonth.put(1, firstDayOfTheWeekParam);
        int length = localDate.getMonth().length(leapYearCheck.isLeapYearCheckValue());

        int nextDay = 1;
        for (int i  = 2; i <= length ; i++) {
            String dayOfWeekIncrement = firstDayOfMonthName.plus(nextDay).name();
            dayOfTheWeekInMonth.put(i, dayOfWeekIncrement);
            nextDay++;
        }
    }
}


//        ---------------------Below logic to calculate Workdays---------------------------
//        List<Integer> workdaysListAfterValid = new ArrayList<>();
//        Workdays[] valuesFromEnumWorkdays = Workdays.values();
//        String workdaysEnumAsString = Arrays.toString(valuesFromEnumWorkdays);
//        String dayOfWeekAsString = firstDayOfMonthName.toString();
//
//        for (int i = 0; i < valuesFromEnumWorkdays.length; i++) {
//            if (workdaysEnumAsString.contains(dayOfWeekAsString)) {
//                isWorkingDay = true;
//                workdaysListAfterValid.add(listYearMonthDay.get(2));
//                System.out.println(dayOfWeekAsString + " is working day!");
//            } else {
//                isWorkingDay = false;
//                System.out.println(dayOfWeekAsString + " is NOT working day!");
//            }
//            break;
//        }
//
//        System.out.println("List: " + workdaysListAfterValid);
//    }

