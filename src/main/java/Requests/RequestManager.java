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

    public Address getAddress() {
        String response = getRequest(addressEndpoint);
        Address address = null;

        if (response != null) {
            address = gson.fromJson(response, Address.class);
        }

        return address;
    }

    public Appliance getAppliance() {
        String response = getRequest(applianceEndpoint);
        Appliance appliance = null;

        if (response != null) {
            appliance = gson.fromJson(response, Appliance.class);
        }

        return appliance;
    }

    public Bank getBank() {
        String response = getRequest(bankEndpoint);
        Bank bank = null;

        if (response != null) {
            bank = gson.fromJson(response, Bank.class);
        }

        return bank;
    }

    public Beer getBeer() {
        String response = getRequest(beerEndpoint);
        Beer beer = null;

        if (response != null) {
            beer = gson.fromJson(response, Beer.class);
        }

        return beer;
    }

    public BloodType getBloodType() {
        String response = getRequest(bloodTypeEndpoint);
        BloodType bloodType = null;

        if (response != null) {
            gson.fromJson(response, BloodType.class);
        }

        return bloodType;
    }

    public CreditCard getCreditCard() {
        String response = getRequest(creditCardEndpoint);
        CreditCard creditCard = null;

        if (response != null) {
            gson.fromJson(response, CreditCard.class);
        }

        return creditCard;
    }

    public User getUser() {
        String response = getRequest(userEndpoint);
        User user = null;

        if (response != null) {
            gson.fromJson(response, User.class);
        }

        return user;
    }
}
