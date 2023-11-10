package Requests;

import Addresses.Address;
import Appliances.Appliance;
import Banks.Bank;
import Beers.Beer;
import BloodTypes.BloodType;
import CreditCards.CreditCard;
import Users.User;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class RequestManager {


    private final String endpoint = "https://random-data-api.com/api/v2";
    private final String addressEndpoint = endpoint + "/addresses";
    private final String userEndpoint = endpoint + "/users";
    private final String applianceEndpoint = endpoint + "/appliances";
    private final String bankEndpoint = endpoint + "/banks";
    private final String beerEndpoint = endpoint + "/beers";
    private final String bloodTypeEndpoint = endpoint + "/blood_types";
    private final String creditCardEndpoint = endpoint + "/credit_cards";
    private Gson gson = new Gson();
    private int numberOfRequests;
    private int threadSleepValue = 1000;

    public RequestManager(int numberOfRequests) {
        this.numberOfRequests = numberOfRequests;
    }

    private String getRequest(String endpoint) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endpoint)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            return response.body();

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    private Address getAddress() {
        String response = getRequest(addressEndpoint);
        Address address = null;

        if (response != null) {
            address = gson.fromJson(response, Address.class);
        }

        return address;
    }

    private Appliance getAppliance() {
        String response = getRequest(applianceEndpoint);
        Appliance appliance = null;

        if (response != null) {
            appliance = gson.fromJson(response, Appliance.class);
        }

        return appliance;
    }

    private Bank getBank() {
        String response = getRequest(bankEndpoint);
        Bank bank = null;

        if (response != null) {
            bank = gson.fromJson(response, Bank.class);
        }

        return bank;
    }

    private Beer getBeer() {
        String response = getRequest(beerEndpoint);
        Beer beer = null;

        if (response != null) {
            beer = gson.fromJson(response, Beer.class);
        }

        return beer;
    }

    private BloodType getBloodType() {
        String response = getRequest(bloodTypeEndpoint);
        BloodType bloodType = null;

        if (response != null) {
            bloodType = gson.fromJson(response, BloodType.class);
        }

        return bloodType;
    }

    private CreditCard getCreditCard() {
        String response = getRequest(creditCardEndpoint);
        CreditCard creditCard = null;

        if (response != null) {
            creditCard = gson.fromJson(response, CreditCard.class);
        }

        return creditCard;
    }

    private User getUser() {
        String response = getRequest(userEndpoint);
        User user = null;

        if (response != null) {
            user = gson.fromJson(response, User.class);
        }

        return user;
    }

    public ArrayList<Beer> getBeers() {
        ArrayList<Beer> beers = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            beers.add(getBeer());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return beers;
    }

    public ArrayList<Address> getAddresses() {
        ArrayList<Address> addresses = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            addresses.add(getAddress());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return addresses;
    }

    public ArrayList<Appliance> getAppliances() {
        ArrayList<Appliance> appliances = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            appliances.add(getAppliance());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return appliances;
    }

    public ArrayList<Bank> getBanks() {
        ArrayList<Bank> banks = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            banks.add(getBank());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return banks;
    }

    public ArrayList<BloodType> getBloodTypes() {
        ArrayList<BloodType> bloodTypes = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            bloodTypes.add(getBloodType());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return bloodTypes;
    }

    public ArrayList<CreditCard> getCreditCards() {
        ArrayList<CreditCard> creditCards = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            creditCards.add(getCreditCard());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return creditCards;
    }

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < numberOfRequests; i++) {
            users.add(getUser());
            try {
                Thread.sleep(threadSleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return users;
    }
}
