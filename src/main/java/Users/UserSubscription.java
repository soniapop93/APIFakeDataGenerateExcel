package Users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSubscription {
    private String plan;
    private String status;
    private String paymentMethod;
    private String term;

    public UserSubscription(String plan, String status, String paymentMethod, String term) {
        this.plan = plan;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.term = term;
    }
}
