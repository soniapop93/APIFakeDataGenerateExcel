package Requests;

import Addresses.Address;
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
    private final String beerEndpoint = endpoint + "beers";
    private final String bloodTypeEndpoint = endpoint + "blood_type";
    private final String creditCardEndpoint = endpoint + "credit_cards";

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

        if (response != null) {
            Gson gson = new Gson();
            Address address = gson.fromJson(response, Address.class);
        }

        return address;
    }

    public void getAppliance() {
        String response = getRequest(applianceEndpoint);

        if (response != null) {
            //TODO: implement deserialization
        }
    }

    public void getBank() {
        String response = getRequest(bankEndpoint);

        if (response != null) {
            //TODO: implement deserialization
        }
    }

    public void getBeer() {
        String response = getRequest(beerEndpoint);

        if (response != null) {
            //TODO: implement deserialization
        }
    }

    public void getBloodType() {
        String response = getRequest(bloodTypeEndpoint);

        if (response != null) {
            //TODO: implement deserialization
        }
    }

    public void getCreditCard() {
        String response = getRequest(creditCardEndpoint);

        if (response != null) {
            //TODO: implement deserialization
        }
    }

    public void getUser() {
        String response = getRequest(userEndpoint);

        if (response != null) {
            //TODO: implement deserialization
        }
    }
}
