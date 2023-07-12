package pl.dstelamszynski.code;

import java.time.Month;
import java.util.Scanner;

public class DataProvider {
    Scanner scanner = new Scanner(System.in);

    public int yearScanner(){
        return scanner.nextInt();
    }

    public String yearBooleanScanner(){
        return scanner.next();
    }

    public Month monthNameScanner(){
        return Month.valueOf(scanner.next().toUpperCase());
    }

}
