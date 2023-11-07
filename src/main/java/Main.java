import Addresses.Address;
import Beers.Beer;
import Excel.ExcelLogic;
import Requests.RequestManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // API documentation used: https://random-data-api.com/documentation

        RequestManager requestManager = new RequestManager();
//        requestManager.getAddress();
//        requestManager.getAppliance();
//        requestManager.getBank();
//        requestManager.getBeer();
//        requestManager.getBloodType();
//        requestManager.getCreditCard();
        //requestManager.getUser();

        ExcelLogic excelLogic = new ExcelLogic();

        ArrayList<Beer> beers = requestManager.getBeers();
        excelLogic.generateExcel(beers, "Beers");
    }
}