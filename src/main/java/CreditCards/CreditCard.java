package CreditCards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
    private int id;
    private String uid;
    private String creditCardNumber;
    private String creditCardExpiryDate;
    private String creditCardType;

    public CreditCard(int id, String uid, String creditCardNumber, String creditCardExpiryDate, String creditCardType) {
        this.id = id;
        this.uid = uid;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiryDate = creditCardExpiryDate;
        this.creditCardType = creditCardType;
    }
}
