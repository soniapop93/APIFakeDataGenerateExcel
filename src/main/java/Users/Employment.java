package Users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employment {
    private String title;
    private String keySkill;

    public Employment(String title, String keySkill) {
        this.title = title;
        this.keySkill = keySkill;
    }
}
