package pl.dstelamszynski.code;

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DataProvider {

    Scanner scanner = new Scanner(System.in);
    static DataProvider dataProvider = new DataProvider();
    int year = scanner.nextInt();
    static int yearValue = dataProvider.year;

//    Month month = Month.valueOf(scanner.next().toUpperCase());
//    String input = scanner.next();


}
