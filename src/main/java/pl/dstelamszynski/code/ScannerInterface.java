package pl.dstelamszynski.code;

import java.util.Map;

public interface ScannerInterface {
    int yearScanner() throws Exception;

    String yearBooleanScanner();

    void monthAsIntScanner();

    int mileAgeScanner();

    Map<Integer, Integer> fuelingDayAndMileageScanner();

    int firstDayOfMonth();

    void holidaysFinder();

    int initialMileageScanner();
}
