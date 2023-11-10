import Addresses.Address;
import Appliances.Appliance;
import Banks.Bank;
import Beers.Beer;
import BloodTypes.BloodType;
import CreditCards.CreditCard;
import Excel.ExcelLogic;
import Requests.RequestManager;
import Requests.RequestsData;
import Users.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // API documentation used: https://random-data-api.com/documentation

        Scanner scanner = new Scanner(System.in);
        System.out.print("Add path where you want to save the Excel file: ");
        String path = scanner.nextLine();

        System.out.print("Add the name of the file: ");
        String fileName = scanner.nextLine();

        System.out.print("Add number of rows for every sheet (must be between 1 - 30): ");
        int requestsNumber = Integer.parseInt(scanner.nextLine());

        if (path != null && fileName != null && requestsNumber > 0) {
            ExcelLogic excelLogic = new ExcelLogic(path + "\\" + fileName + ".xlsx");
            RequestManager requestManager = new RequestManager(requestsNumber);

            ArrayList<Beer> beers = requestManager.getBeers();
            ArrayList<Bank> banks = requestManager.getBanks();
            ArrayList<Address> addresses = requestManager.getAddresses();
            ArrayList<Appliance> appliances = requestManager.getAppliances();
            ArrayList<BloodType> bloodTypes = requestManager.getBloodTypes();
            ArrayList<CreditCard> creditCards = requestManager.getCreditCards();
            ArrayList<User> users = requestManager.getUsers();

            RequestsData requestsData = new RequestsData(beers, banks, addresses, appliances, bloodTypes, creditCards, users);

            excelLogic.generateExcel(requestsData);
        }
    }
}