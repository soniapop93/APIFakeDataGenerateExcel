package CreditCards;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
    private int id;
    private String uid;
    @SerializedName("credit_card_number")
    private String creditCardNumber;
    @SerializedName("credit_card_expiry_date")
    private String creditCardExpiryDate;
    @SerializedName("credit_card_type")
    private String creditCardType;

    public CreditCard(int id,
                      String uid,
                      String creditCardNumber,
                      String creditCardExpiryDate,
                      String creditCardType) {
        this.id = id;
        this.uid = uid;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiryDate = creditCardExpiryDate;
        this.creditCardType = creditCardType;
    }
}
