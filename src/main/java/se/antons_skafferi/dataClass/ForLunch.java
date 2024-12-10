package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "for_lunch")
public class ForLunch {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Date date;
    private Integer price;
    private Integer menu_item_id;
    private Integer lunch_id;

    public Date getDate() { return date; }
    public Integer getPrice() {
        return price;
    }
    public Integer getMenu_item_id() {
        return menu_item_id;
    }
    public Integer getLunch_id() {
        return lunch_id;
    }


    public void setDate(Date date) { this.date = date; }
    public void setMenu_item_id(Integer menu_item_id) {
        this.menu_item_id = menu_item_id;
    }
    public void setLunch_id(Integer lunch_id) {
        this.lunch_id = lunch_id;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

}