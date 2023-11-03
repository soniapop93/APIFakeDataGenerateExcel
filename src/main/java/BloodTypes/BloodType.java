package BloodTypes;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BloodType {
    private int id;
    private String uid;
    private String type;
    @SerializedName("rh_factor")
    private String rhFactor;
    private String group;

    public BloodType(int id,
                     String uid,
                     String type,
                     String rhFactor,
                     String group) {
        this.id = id;
        this.uid = uid;
        this.type = type;
        this.rhFactor = rhFactor;
        this.group = group;
    }
}
