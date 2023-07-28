package pl.dstelamszynski.code;

import java.util.List;

public interface ScannerInterface {
    int yearScanner() throws Exception;
    int dayScanner();

    String yearBooleanScanner();

    void monthAsIntScanner();

    int mileAgeScanner();

    List<Object> day_amountOfGasoline_mileAge_costScanner();

    int firstDayOfMonth();

    void holidaysFinder();

    int initialMileageScanner();
}
