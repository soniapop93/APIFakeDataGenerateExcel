package Users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String uid;
    private String password;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String avatar;
    private String gender;
    private String phoneNumber;
    private String socialInsuranceNumber;
    private String dateOfBirth;
    private Employment employment;
    private UserAddress userAddress;
    private String creditCardNumber;
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
                String creditCardNumber,
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
        this.creditCardNumber = creditCardNumber;
        this.userSubscription = userSubscription;
    }
}
