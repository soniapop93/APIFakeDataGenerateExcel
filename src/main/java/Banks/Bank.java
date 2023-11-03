package Banks;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
    private int id;
    private String uid;
    @SerializedName("account_number")
    private String accountNumber;
    @SerializedName("bank_name")
    private String bankName;
    @SerializedName("routing_number")
    private String routingNumber;
    @SerializedName("swift_bic")
    private String swiftBic;

    public Bank(int id, String uid, String accountNumber, String bankName, String routingNumber, String swiftBic) {
        this.id = id;
        this.uid = uid;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.routingNumber = routingNumber;
        this.swiftBic = swiftBic;
    }
}
