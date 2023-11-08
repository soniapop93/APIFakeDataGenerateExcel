package Requests;

import Addresses.Address;
import Appliances.Appliance;
import Banks.Bank;
import Beers.Beer;
import BloodTypes.BloodType;
import Users.CreditCard;
import Users.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class RequestsData {
    private ArrayList<Beer> beers;
    private ArrayList<Bank> banks;
    private  ArrayList<Address> addresses;
    private ArrayList<Appliance> appliances;
    private ArrayList<BloodType> bloodTypes;
    private ArrayList<CreditCard> creditCards;
    private ArrayList<User> users;

    public RequestsData(
            ArrayList<Beer> beers,
            ArrayList<Bank> banks,
            ArrayList<Address> addresses,
            ArrayList<Appliance> appliances,
            ArrayList<BloodType> bloodTypes,
            ArrayList<CreditCard> creditCards,
            ArrayList<User> users) {
        this.beers = beers;
        this.banks = banks;
        this.addresses = addresses;
        this.appliances = appliances;
        this.bloodTypes = bloodTypes;
        this.creditCards = creditCards;
        this.users = users;
    }
}
