package pl.dstelamszynski.code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WorkdayFind {

    public static void main(String[] args) {
        //---------Base methods call to gather data need later begin---------
        WorkdayFind workdayFind = new WorkdayFind();
        LeapYearCheck leapYearCheck = workdayFind.leapYearCheck;
        leapYearCheck.dataProvider.initialMileageScanner();
        leapYearCheck.mapWithDaysAndMileageInitFiller();
        leapYearCheck.dataProvider.firstDayOfMonth();
//---------Base methods call to gather data need later end---------

        System.out.println("testowe" + workdayFind.dayOfTheWeekInMonth);
        System.out.println("testowe2" + leapYearCheck.dataProvider.getDayAndMileage());


        workdayFind.dayOfTheWeekInOrderInput();
        System.out.println("dayOfTheWeekInMonth: " + workdayFind.dayOfTheWeekInMonth);

        workdayFind.workdayFinder(leapYearCheck.dataProvider.getDayAndMileage());
        System.out.println("DayAndMileage: " + leapYearCheck.dataProvider.getDayAndMileage());
    }

    LeapYearCheck leapYearCheck = new LeapYearCheck();
    Map<Integer, String> dayOfTheWeekInMonth = new LinkedHashMap<>();
    boolean isWorkingDay;

    public void dayOfTheWeekInOrderInput() {
        List<Integer> listYearMonthDay = leapYearCheck.dataProvider.getListYearMonthDay();
        LocalDate localDate = LocalDate.of(listYearMonthDay.get(0), listYearMonthDay.get(1), listYearMonthDay.get(2));
        DayOfWeek firstDayOfMonthName = DayOfWeek.from(localDate);
        String firstDayOfTheWeekParam = firstDayOfMonthName.toString();
        dayOfTheWeekInMonth.put(1, firstDayOfTheWeekParam);
        int length = localDate.getMonth().length(leapYearCheck.isLeapYearCheckValue());

        int nextDay = 1;
        for (int i = 2; i <= length; i++) {
            String dayOfWeekIncrement = firstDayOfMonthName.plus(nextDay).name();
            dayOfTheWeekInMonth.put(i, dayOfWeekIncrement);
            nextDay++;
        }
    }

    //TODO method replacing workdays works -> need to change replacement value
    public boolean workdayFinder(Map<Integer, Integer> daysAndMileage) {
        Stream<String> workdaysValuesStream = Arrays.stream(Workdays.values()).map(Enum::toString);
        List<String> workdayValues = workdaysValuesStream.toList();

        int listValuesCounter = 0;
        for (int i = 1; i <= daysAndMileage.size(); i++) {
            if (dayOfTheWeekInMonth.get(i).contains(workdayValues.get(listValuesCounter))) {
                daysAndMileage.replace(i, 99);
                listValuesCounter++;
                if (listValuesCounter > 4) {
                    listValuesCounter = 0;
                }
            }
        }
        return isWorkingDay;
    }
}


