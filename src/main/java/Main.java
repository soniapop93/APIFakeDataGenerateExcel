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

public class Main {
    public static void main(String[] args) {
        // API documentation used: https://random-data-api.com/documentation

        RequestManager requestManager = new RequestManager();
        ExcelLogic excelLogic = new ExcelLogic();

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