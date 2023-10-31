package Users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddress {
    private String city;
    private String streetName;
    private String streetAddress;
    private String zipCode;
    private String state;
    private String country;
    private String latitude;
    private String longitude;

    public UserAddress(String city,
                       String streetName,
                       String streetAddress,
                       String zipCode,
                       String state,
                       String country,
                       String latitude,
                       String longitude)
    {
        this.city = city;
        this.streetName = streetName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
