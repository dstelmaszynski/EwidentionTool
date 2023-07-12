package pl.dstelamszynski.code;

import java.util.Scanner;

public class DataProvider {
    Scanner scanner = new Scanner(System.in);

    public int yearScanner(){
        return scanner.nextInt();
    }

    public String yearBooleanScanner(){
        return scanner.next();
    }

    public String monthNameScanner(){
        return scanner.next().toUpperCase();
    }

}
