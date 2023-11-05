package Users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String uid;
    private String password;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private String username;
    private String email;
    private String avatar;
    private String gender;
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("social_insurance_number")
    private String socialInsuranceNumber;
    @SerializedName("date_of_birth")
    private String dateOfBirth;
    private Employment employment;
    @SerializedName("address")
    private UserAddress userAddress;
    @SerializedName("credit_card")
    private CreditCard creditCard;
    @SerializedName("subscription")
    private UserSubscription userSubscription;

    public User(int id,
                String uid,
                String password,
                String firstName,
                String lastName,
                String username,
                String email,
                String avatar,
                String gender,
                String phoneNumber,
                String socialInsuranceNumber,
                String dateOfBirth,
                Employment employment,
                UserAddress userAddress,
                CreditCard creditCard,
                UserSubscription userSubscription) {
        this.id = id;
        this.uid = uid;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.socialInsuranceNumber = socialInsuranceNumber;
        this.dateOfBirth = dateOfBirth;
        this.employment = employment;
        this.userAddress = userAddress;
        this.creditCard = creditCard;
        this.userSubscription = userSubscription;
    }
}
