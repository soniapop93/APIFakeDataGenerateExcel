package Appliances;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Appliance {
    private int id;
    private String uid;
    private String brand;
    private String equipment;

    public Appliance(int id, String uid, String brand, String equipment) {
        this.id = id;
        this.uid = uid;
        this.brand = brand;
        this.equipment = equipment;
    }
}
