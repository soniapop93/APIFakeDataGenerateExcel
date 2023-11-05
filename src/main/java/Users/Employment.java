package Users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employment {
    private String title;
    @SerializedName("key_skill")
    private String keySkill;

    public Employment(String title, String keySkill) {
        this.title = title;
        this.keySkill = keySkill;
    }
}
