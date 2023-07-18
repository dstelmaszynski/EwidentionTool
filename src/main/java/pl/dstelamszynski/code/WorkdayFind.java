package pl.dstelamszynski.code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkdayFind {
    LeapYearCheck leapYearCheck = new LeapYearCheck();

    public void workdayFinder() {
        List<Integer> listDateParamsLD = leapYearCheck.dataProvider.listDateParams;

        LocalDate localDate = LocalDate.of(listDateParamsLD.get(0), listDateParamsLD.get(1), listDateParamsLD.get(2));
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

        List<Integer> workdaysListAfterValid = new ArrayList<>();
        Workdays[] valuesFromEnumWorkdays = Workdays.values();
        String workdaysEnumAsString = Arrays.toString(valuesFromEnumWorkdays);
        String dayOfWeekAsString = dayOfWeek.toString();

        boolean isWorkingDay;
        for (int i = 0; i < valuesFromEnumWorkdays.length; i++) {
            if (workdaysEnumAsString.contains(dayOfWeekAsString)) {
                isWorkingDay = true;
                workdaysListAfterValid.add(listDateParamsLD.get(2));
                System.out.println(dayOfWeekAsString + " is working day!");
            } else {
                isWorkingDay = false;
                System.out.println(dayOfWeekAsString + " is NOT working day!");
            }
            break;
        }

        System.out.println("List: " + workdaysListAfterValid);
    }
}
