package Users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSubscription {
    private String plan;
    private String status;
    @SerializedName("payment_method")
    private String paymentMethod;
    private String term;

    public UserSubscription(String plan, String status, String paymentMethod, String term) {
        this.plan = plan;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.term = term;
    }
}
