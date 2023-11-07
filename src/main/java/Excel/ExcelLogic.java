package Excel;

import Beers.Beer;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class ExcelLogic {
    HSSFWorkbook workbook = new HSSFWorkbook();
    private String filePath = "";

    public void generateExcel(ArrayList<Beer> beers) {

        try {
            HSSFSheet sheet = createSheet("");
            addDataBeers(sheet, beers);
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

    private void addDataBeers(HSSFSheet sheet, ArrayList<Beer> beers)
    {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Brand");
        rowhead.createCell(3).setCellValue("Name");
        rowhead.createCell(4).setCellValue("Style");
        rowhead.createCell(5).setCellValue("Hop");
        rowhead.createCell(6).setCellValue("Yeast");
        rowhead.createCell(7).setCellValue("Malts");
        rowhead.createCell(8).setCellValue("IBU");
        rowhead.createCell(9).setCellValue("Alcohol");
        rowhead.createCell(10).setCellValue("BLG");

        for (int i = 0; i < beers.size(); i++)
        {
            HSSFRow row = sheet.createRow(i);

            row.createCell(0).setCellValue(String.valueOf(beers.get(i).getId()));
            row.createCell(1).setCellValue(beers.get(i).getUid());
            row.createCell(2).setCellValue(beers.get(i).getBrand());
            row.createCell(3).setCellValue(beers.get(i).getName());
            row.createCell(4).setCellValue(beers.get(i).getStyle());
            row.createCell(5).setCellValue(beers.get(i).getHop());
            row.createCell(6).setCellValue(beers.get(i).getYeast());
            row.createCell(7).setCellValue(beers.get(i).getMalts());
            row.createCell(8).setCellValue(beers.get(i).getIbu());
            row.createCell(9).setCellValue(beers.get(i).getAlcohol());
            row.createCell(10).setCellValue(beers.get(i).getBlg());
        }
    }
}
