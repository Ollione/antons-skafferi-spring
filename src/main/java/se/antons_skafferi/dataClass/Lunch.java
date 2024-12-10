package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lunch")
public class Lunch {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer menu_item_id;
    private Integer lunch_id;

    public Integer getMenu_item_id() {
        return menu_item_id;
    }
    public Integer getLunch_id() {
        return lunch_id;
    }


    public void setMenu_item_id(Integer menu_item_id) {
        this.menu_item_id = menu_item_id;
    }
    public void setLunch_id(Integer lunch_id) {
        this.lunch_id = lunch_id;
    }
}
