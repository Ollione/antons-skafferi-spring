package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dinner_menu")
public class DinnerMenu {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer dinner_item_id;
    private Integer menu_item_id;
    private Integer price;

    public Integer getDinner_id() {
        return dinner_item_id;
    }
    public Integer getMenu_item_id() {
        return menu_item_id;
    }
    public Integer getPrice() {
        return price;
    }
}
