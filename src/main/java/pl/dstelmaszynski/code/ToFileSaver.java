package pl.dstelmaszynski.code;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class ToFileSaver extends DataProvider{
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Document_mileage_1");
    int rowNumber = 0;
    public void fileSaver(Map<Integer, Integer> dayAndMileage) throws IOException {

        for (Map.Entry<Integer, Integer> entry : dayAndMileage.entrySet()) {
            XSSFRow row = sheet.createRow(rowNumber++);
            row.createCell(0).setCellValue("day " + entry.getKey());
            row.createCell(1).setCellValue(entry.getValue() + " km");
        }

        //TODO need to provide real path below
        FileOutputStream file = new FileOutputStream("");
        workbook.write(file);
        file.close();
        System.out.println("Data copied successfully!");
    }
}
