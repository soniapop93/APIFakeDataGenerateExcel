package Excel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ExcelLogic {
    HSSFWorkbook workbook = new HSSFWorkbook();
    private String filePath = "";

    public void generateExcel() {

        try {
            HSSFSheet sheet = createSheet("");
            addDataBeers(sheet);
            OutputStream file = new FileOutputStream(filePath);
            try {
                workbook.write(file);
                file.close();
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private HSSFSheet createSheet(String sheetName) {
        HSSFSheet sheet = workbook.createSheet(sheetName);

        return sheet;
    }

    private void addDataBeers(HSSFSheet sheet){
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("");

        HSSFRow row = sheet.createRow(1);
        row.createCell(1).setCellValue("");
    }
}
