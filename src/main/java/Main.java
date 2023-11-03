import Addresses.Address;
import Requests.RequestManager;

public class Main {
    public static void main(String[] args) {
        // API documentation used: https://random-data-api.com/documentation

        RequestManager requestManager = new RequestManager();
        requestManager.getAddress();
        requestManager.getAppliance();
        requestManager.getBank();
        requestManager.getBeer();
        requestManager.getBloodType();

    }
}