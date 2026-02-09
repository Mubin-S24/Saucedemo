package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {

    public static Object[][] readExcel(String filePath, String sheetName) {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheet(sheetName);

            DataFormatter formatter = new DataFormatter();

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rows - 1][cols];

            for (int i = 1; i < rows; i++) {
                Row row = sheet.getRow(i);

                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);

                    if (cell == null) {
                        data[i - 1][j] = "";
                    } else {
                        data[i - 1][j] = formatter.formatCellValue(cell);
                    }
                }
            }

            return data;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
