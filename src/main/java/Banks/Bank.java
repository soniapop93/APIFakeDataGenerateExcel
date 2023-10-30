package Banks;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
    private int id;
    private String uid;
    private String accountNumber;
    private String bankName;
    private String routingNumber;
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
