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
    }

    LeapYearCheck leapYearCheck = new LeapYearCheck();
    Map<Integer, String> dayOfTheWeekInMonth = new LinkedHashMap<>();

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

    public void workdayFinder(Map<Integer, Integer> daysAndMileage) {
        Stream<String> workdaysValuesStream = Arrays.stream(Workdays.values()).map(Enum::toString);
        List<String> workdayValues = workdaysValuesStream.toList();

        int listValuesCounter = 0;
        for (int i = 1; i <= daysAndMileage.size(); i++) {
            if (dayOfTheWeekInMonth.get(i).contains(workdayValues.get(listValuesCounter))) {
                listValuesCounter++;
                if (listValuesCounter > 4) {
                    listValuesCounter = 0;
                }
            } else daysAndMileage.replace(i, 999);
        }
    }
}


