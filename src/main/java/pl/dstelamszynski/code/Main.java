package pl.dstelamszynski.code;

import java.time.Month;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter year YYYY!\n");
        LeapYearCheck leapYearCheck = new LeapYearCheck();
        leapYearCheck.leapYearChecker();

        System.out.println("Please enter month!\n");
        System.out.print(
                """
                        1. January
                        2. February
                        3. March
                        4. April
                        5. May
                        6. June
                        7. July
                        8. August
                        9. September
                        10. October
                        11. November
                        12. December""");


        String nameOfSearchedMonth = leapYearCheck.dataProvider.monthNameScanner();
        System.out.println("Please type:\n YES if it's leap year\n NO if it's not\n");
        Month month = Month.valueOf(nameOfSearchedMonth);
        System.out.println("\n" + month.length(leapYearCheck.monthValidation()));




//        System.out.println("Days in month: " +);


    }


}
