package se.antons_skafferi.sqlDataClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Lunch {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer menu_item_id;
    private Integer lunch_id;
    private Date date;

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
    public void setDate(Date date) {
        this.date = date;
    }
}
