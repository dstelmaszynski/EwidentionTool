package pl.dstelamszynski.code;

import java.util.Map;

public interface ScannerInterface {
    int yearScanner() throws Exception;

    String yearBooleanScanner();

    int monthAsIntScanner();

    int mileAgeScanner();

    Map<Integer, Integer> fuelingDayScanner();

    int firstDayOfMonth();

    void holidaysFinder();
}
