package pl.dstelamszynski.code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkdayFind {
    LeapYearCheck leapYearCheck = new LeapYearCheck();

    public void workdayFinder() {
        List<Integer> listDateParamsLD = leapYearCheck.dataProvider.listDateParams;
        int searchedMonthAsInt = leapYearCheck.dataProvider.listDateParams.get(1);
        Month month = Month.of(searchedMonthAsInt);
        LocalDate localDate = LocalDate.of(listDateParamsLD.get(0), listDateParamsLD.get(1), listDateParamsLD.get(2));
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

        List<String> workdaysListAfterValid = new ArrayList<>();
        Workdays[] valuesFromEnumWorkdays = Workdays.values();
        String workdaysEnumAsString = Arrays.toString(valuesFromEnumWorkdays);
        String dayOfWeekAsString = dayOfWeek.toString();

        boolean isWorkingDay;
        for (int i = 0; i < valuesFromEnumWorkdays.length; i++) {
            if (workdaysEnumAsString.contains(dayOfWeekAsString)) {
                isWorkingDay = true;
                workdaysListAfterValid.add(dayOfWeekAsString);
                System.out.println(dayOfWeekAsString + " is working day!");
                return;
            } else {
                isWorkingDay = false;
                System.out.println(dayOfWeekAsString + " is NOT working day!");
                break;
            }
        }

    }
}
