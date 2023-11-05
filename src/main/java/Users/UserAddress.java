package Users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddress {
    private String city;
    @SerializedName("street_name")
    private String streetName;
    @SerializedName("street_address")
    private String streetAddress;
    @SerializedName("zip_code")
    private String zipCode;
    private String state;
    private String country;
    private Coordinates coordinates;

    public UserAddress(String city,
                       String streetName,
                       String streetAddress,
                       String zipCode,
                       String state,
                       String country,
                       Coordinates coordinates)
    {
        this.city = city;
        this.streetName = streetName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
        this.coordinates = coordinates;
    }
}
