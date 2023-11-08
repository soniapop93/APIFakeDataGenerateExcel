package Excel;

import Addresses.Address;
import Banks.Bank;
import Beers.Beer;
import Requests.RequestsData;
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

    private String[] sheetNames = {"Addresses","Appliances", "Banks", "Beers", "Blood types", "Credit Cards", "Users"};

    public void generateExcel(RequestsData requestsData, String sheetName) {
        try {
            // Addresses
            addDataAddresses(createSheet(sheetNames[0]), requestsData.getAddresses());
            // Appliances

            // Banks
            addDataBank(createSheet(sheetNames[2]), requestsData.getBanks());
            // Beers
            addDataBeers(createSheet(sheetNames[3]), requestsData.getBeers());

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

    private void addDataAddresses(HSSFSheet sheet, ArrayList<Address> addresses)
    {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Street Name");
        rowhead.createCell(3).setCellValue("Street Address");
        rowhead.createCell(4).setCellValue("Secondary Address");
        rowhead.createCell(5).setCellValue("Building Number");
        rowhead.createCell(6).setCellValue("Mailbox");
        rowhead.createCell(7).setCellValue("Community");
        rowhead.createCell(8).setCellValue("Zip Code");
        rowhead.createCell(9).setCellValue("Zip");
        rowhead.createCell(10).setCellValue("Postcode");
        rowhead.createCell(11).setCellValue("Timezone");
        rowhead.createCell(12).setCellValue("Street Suffix");
        rowhead.createCell(13).setCellValue("City Suffix");
        rowhead.createCell(14).setCellValue("City Prefix");
        rowhead.createCell(15).setCellValue("State");
        rowhead.createCell(16).setCellValue("State Abbr");
        rowhead.createCell(17).setCellValue("Country");
        rowhead.createCell(18).setCellValue("Country Code");
        rowhead.createCell(19).setCellValue("Latitude");
        rowhead.createCell(20).setCellValue("Longitude");
        rowhead.createCell(21).setCellValue("Full Address");

        for (int i = 0; i < addresses.size(); i++)
        {
            HSSFRow row = sheet.createRow(i + 1);

            row.createCell(0).setCellValue(String.valueOf(addresses.get(i).getId()));
            row.createCell(1).setCellValue(addresses.get(i).getUid());
            row.createCell(2).setCellValue(addresses.get(i).getCity());
            row.createCell(3).setCellValue(addresses.get(i).getStreetName());
            row.createCell(4).setCellValue(addresses.get(i).getStreetAddress());
            row.createCell(5).setCellValue(addresses.get(i).getSecondaryAddress());
            row.createCell(6).setCellValue(addresses.get(i).getBuildingNumber());
            row.createCell(7).setCellValue(addresses.get(i).getMailBox());
            row.createCell(8).setCellValue(addresses.get(i).getCommunity());
            row.createCell(9).setCellValue(addresses.get(i).getZipCode());
            row.createCell(10).setCellValue(addresses.get(i).getZip());
            row.createCell(11).setCellValue(addresses.get(i).getPostcode());
            row.createCell(12).setCellValue(addresses.get(i).getTimezone());
            row.createCell(13).setCellValue(addresses.get(i).getStreetSuffix());
            row.createCell(14).setCellValue(addresses.get(i).getCityPrefix());
            row.createCell(15).setCellValue(addresses.get(i).getState());
            row.createCell(16).setCellValue(addresses.get(i).getStateAbbr());
            row.createCell(17).setCellValue(addresses.get(i).getCountry());
            row.createCell(18).setCellValue(addresses.get(i).getCountryCode());
            row.createCell(19).setCellValue(addresses.get(i).getLatitude());
            row.createCell(20).setCellValue(addresses.get(i).getLongitude());
            row.createCell(21).setCellValue(addresses.get(i).getFullAddress());
        }
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
            HSSFRow row = sheet.createRow(i + 1);

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

    private void addDataBank(HSSFSheet sheet, ArrayList<Bank> banks)
    {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Account Number");
        rowhead.createCell(3).setCellValue("Bank Name");
        rowhead.createCell(4).setCellValue("Routing Number");
        rowhead.createCell(5).setCellValue("Swift BIC");

        for (int i = 0; i < banks.size(); i++)
        {
            HSSFRow row = sheet.createRow(i + 1);

            row.createCell(0).setCellValue(String.valueOf(banks.get(i).getId()));
            row.createCell(1).setCellValue(banks.get(i).getUid());
            row.createCell(2).setCellValue(banks.get(i).getAccountNumber());
            row.createCell(3).setCellValue(banks.get(i).getBankName());
            row.createCell(4).setCellValue(banks.get(i).getRoutingNumber());
            row.createCell(5).setCellValue(banks.get(i).getSwiftBic());
        }
    }
}
