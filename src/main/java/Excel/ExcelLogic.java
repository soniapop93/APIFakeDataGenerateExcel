package Excel;

import Addresses.Address;
import Appliances.Appliance;
import Banks.Bank;
import Beers.Beer;
import BloodTypes.BloodType;
import CreditCards.CreditCard;
import Requests.RequestsData;
import Users.User;
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
    private String filePath;
    private String[] sheetNames = {"Addresses","Appliances", "Banks", "Beers", "Blood types", "Credit Cards", "Users"};

    public ExcelLogic(String filePath) {
        this.filePath = filePath;
    }

    public void generateExcel(RequestsData requestsData) {
        try {
            // Addresses
            addDataAddresses(createSheet(sheetNames[0]), requestsData.getAddresses());
            // Appliances
            addDataAppliances(createSheet(sheetNames[1]), requestsData.getAppliances());
            // Banks
            addDataBank(createSheet(sheetNames[2]), requestsData.getBanks());
            // Beers
            addDataBeers(createSheet(sheetNames[3]), requestsData.getBeers());
            // Blood Types
            addDataBloodTypes(createSheet(sheetNames[4]), requestsData.getBloodTypes());
            // Credit Cards
            addDataCreditCards(createSheet(sheetNames[5]), requestsData.getCreditCards());
            // Users
            addDataUsers(createSheet(sheetNames[6]), requestsData.getUsers());

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

    private void addDataAppliances(HSSFSheet sheet, ArrayList<Appliance> appliances)
    {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Brand");
        rowhead.createCell(3).setCellValue("Equipment");

        for (int i = 0; i < appliances.size(); i++)
        {
            HSSFRow row = sheet.createRow(i + 1);

            row.createCell(0).setCellValue(String.valueOf(appliances.get(i).getId()));
            row.createCell(1).setCellValue(appliances.get(i).getUid());
            row.createCell(2).setCellValue(appliances.get(i).getBrand());
            row.createCell(3).setCellValue(appliances.get(i).getEquipment());
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

    private void addDataBloodTypes(HSSFSheet sheet, ArrayList<BloodType> bloodTypes)
    {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Type");
        rowhead.createCell(3).setCellValue("RH Factor");
        rowhead.createCell(4).setCellValue("Group");

        for (int i = 0; i < bloodTypes.size(); i++)
        {
            HSSFRow row = sheet.createRow(i + 1);

            row.createCell(0).setCellValue(String.valueOf(bloodTypes.get(i).getId()));
            row.createCell(1).setCellValue(bloodTypes.get(i).getUid());
            row.createCell(2).setCellValue(bloodTypes.get(i).getType());
            row.createCell(3).setCellValue(bloodTypes.get(i).getRhFactor());
            row.createCell(4).setCellValue(bloodTypes.get(i).getGroup());
        }
    }

    private void addDataCreditCards(HSSFSheet sheet, ArrayList<CreditCard> creditCards)
    {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Credit Card Number");
        rowhead.createCell(3).setCellValue("Credit Card Expiry Date");
        rowhead.createCell(4).setCellValue("Credit Card Type");

        for (int i = 0; i < creditCards.size(); i++)
        {
            HSSFRow row = sheet.createRow(i + 1);

            row.createCell(0).setCellValue(String.valueOf(creditCards.get(i).getId()));
            row.createCell(1).setCellValue(creditCards.get(i).getUid());
            row.createCell(2).setCellValue(creditCards.get(i).getCreditCardNumber());
            row.createCell(3).setCellValue(creditCards.get(i).getCreditCardExpiryDate());
            row.createCell(4).setCellValue(creditCards.get(i).getCreditCardType());
        }
    }

    private void addDataUsers(HSSFSheet sheet, ArrayList<User> users) {
        HSSFRow rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("ID");
        rowhead.createCell(1).setCellValue("UID");
        rowhead.createCell(2).setCellValue("Password");
        rowhead.createCell(3).setCellValue("First Name");
        rowhead.createCell(4).setCellValue("Last Name");
        rowhead.createCell(5).setCellValue("Username");
        rowhead.createCell(6).setCellValue("Email");
        rowhead.createCell(7).setCellValue("Avatar");
        rowhead.createCell(8).setCellValue("Gender");
        rowhead.createCell(9).setCellValue("Phone Number");
        rowhead.createCell(10).setCellValue("Social Insurance Number");
        rowhead.createCell(11).setCellValue("Date Of Birth");
        rowhead.createCell(12).setCellValue("Employment title");
        rowhead.createCell(13).setCellValue("Employment Key Skill");
        rowhead.createCell(14).setCellValue("City");
        rowhead.createCell(15).setCellValue("Street name");
        rowhead.createCell(16).setCellValue("Street Address");
        rowhead.createCell(17).setCellValue("Zip Code");
        rowhead.createCell(18).setCellValue("State");
        rowhead.createCell(19).setCellValue("Country");
        rowhead.createCell(20).setCellValue("Latitude");
        rowhead.createCell(21).setCellValue("Longitude");
        rowhead.createCell(22).setCellValue("Credit Card Number");
        rowhead.createCell(23).setCellValue("Subscription plan");
        rowhead.createCell(24).setCellValue("Subscription status");
        rowhead.createCell(25).setCellValue("Subscription payment method");
        rowhead.createCell(26).setCellValue("Subscription term");

        for (int i = 0; i < users.size(); i++)
        {
            HSSFRow row = sheet.createRow(i + 1);

            row.createCell(0).setCellValue(String.valueOf(users.get(i).getId()));
            row.createCell(1).setCellValue(users.get(i).getUid());
            row.createCell(2).setCellValue(users.get(i).getPassword());
            row.createCell(3).setCellValue(users.get(i).getFirstName());
            row.createCell(4).setCellValue(users.get(i).getLastName());
            row.createCell(5).setCellValue(users.get(i).getUsername());
            row.createCell(6).setCellValue(users.get(i).getEmail());
            row.createCell(7).setCellValue(users.get(i).getAvatar());
            row.createCell(8).setCellValue(users.get(i).getGender());
            row.createCell(9).setCellValue(users.get(i).getPhoneNumber());
            row.createCell(10).setCellValue(users.get(i).getSocialInsuranceNumber());
            row.createCell(11).setCellValue(users.get(i).getDateOfBirth());
            row.createCell(12).setCellValue(users.get(i).getEmployment().getTitle());
            row.createCell(13).setCellValue(users.get(i).getEmployment().getKeySkill());
            row.createCell(14).setCellValue(users.get(i).getUserAddress().getCity());
            row.createCell(15).setCellValue(users.get(i).getUserAddress().getStreetName());
            row.createCell(16).setCellValue(users.get(i).getUserAddress().getStreetAddress());
            row.createCell(17).setCellValue(users.get(i).getUserAddress().getZipCode());
            row.createCell(18).setCellValue(users.get(i).getUserAddress().getState());
            row.createCell(19).setCellValue(users.get(i).getUserAddress().getCountry());
            row.createCell(20).setCellValue(users.get(i).getUserAddress().getCoordinates().getLatitude());
            row.createCell(21).setCellValue(users.get(i).getUserAddress().getCoordinates().getLongitude());
            row.createCell(22).setCellValue(users.get(i).getCreditCard().getCcNumber());
            row.createCell(23).setCellValue(users.get(i).getUserSubscription().getPlan());
            row.createCell(24).setCellValue(users.get(i).getUserSubscription().getStatus());
            row.createCell(25).setCellValue(users.get(i).getUserSubscription().getPaymentMethod());
            row.createCell(26).setCellValue(users.get(i).getUserSubscription().getTerm());
        }
    }
}
