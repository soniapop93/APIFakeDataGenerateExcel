package Beers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beer {
    private int id;
    private String uid;
    private String brand;
    private String name;
    private String style;
    private String hop;
    private String yeast;
    private String malts;
    private String ibu;
    private String alcohol;
    private String blg;

    public Beer(int id,
                String uid,
                String brand,
                String name,
                String style,
                String hop,
                String yeast,
                String malts,
                String ibu,
                String alcohol,
                String blg) {
        this.id = id;
        this.uid = uid;
        this.brand = brand;
        this.name = name;
        this.style = style;
        this.hop = hop;
        this.yeast = yeast;
        this.malts = malts;
        this.ibu = ibu;
        this.alcohol = alcohol;
        this.blg = blg;
    }
}
