package Addresses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private int id;
    private String uid;
    private String city;
    @SerializedName("street_name")
    private String streetName;
    @SerializedName("street_address")
    private String streetAddress;
    @SerializedName("secondary_address")
    private String secondaryAddress;
    @SerializedName("building_number")
    private String buildingNumber;
    @SerializedName("mail_box")
    private String mailBox;
    private String community;
    @SerializedName("zip_code")
    private String zipCode;
    private String zip;
    private String postcode;
    @SerializedName("time_zone")
    private String timezone;
    @SerializedName("street_suffix")
    private String streetSuffix;
    @SerializedName("city_suffix")
    private String citySuffix;
    @SerializedName("city_prefix")
    private String cityPrefix;
    private String state;
    @SerializedName("state_abbr")
    private String stateAbbr;
    private String country;
    @SerializedName("country_code")
    private String countryCode;
    private double latitude;
    private double longitude;
    @SerializedName("full_address")
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
            double latitude,
            double longitude,
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
