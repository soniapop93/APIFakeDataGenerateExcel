package Addresses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private int id;
    private String uid;
    private String city;
    private String streetName;
    private String streetAddress;
    private String secondaryAddress;
    private String buildingNumber;
    private String mailBox;
    private String community;
    private String zipCode;
    private String zip;
    private String postcode;
    private String timezone;
    private String streetSuffix;
    private String citySuffix;
    private String cityPrefix;
    private String state;
    private String stateAbbr;
    private String country;
    private String countryCode;
    private long latitude;
    private long longitude;
    private String fullAddress;

    public Address(
            int id,
            String uid,
            String city,
            String streetName,
            String streetAddress,
            String secondaryAddress,
            String buildingNumber,
            String mailBox,
            String community,
            String zipCode,
            String zip,
            String postcode,
            String timezone,
            String streetSuffix,
            String citySuffix,
            String cityPrefix,
            String state,
            String stateAbbr,
            String country,
            String countryCode,
            long latitude,
            long longitude,
            String fullAddress) {
        this.id = id;
        this.uid = uid;
        this.city = city;
        this.streetName = streetName;
        this.streetAddress = streetAddress;
        this.secondaryAddress = secondaryAddress;
        this.buildingNumber = buildingNumber;
        this.mailBox = mailBox;
        this.community = community;
        this.zipCode = zipCode;
        this.zip = zip;
        this.postcode = postcode;
        this.timezone = timezone;
        this.streetSuffix = streetSuffix;
        this.citySuffix = citySuffix;
        this.cityPrefix = cityPrefix;
        this.state = state;
        this.stateAbbr = stateAbbr;
        this.country = country;
        this.countryCode = countryCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.fullAddress = fullAddress;
    }
}
