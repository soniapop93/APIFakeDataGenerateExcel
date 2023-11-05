package Users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
    @SerializedName("cc_number")
    private String ccNumber;

    public CreditCard(String ccNumber) {
        this.ccNumber = ccNumber;
    }
}
