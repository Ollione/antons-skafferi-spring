package se.antons_skafferi.sqlDataClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer MenuItemID;
    private String Name;
    private String Description;
    private String TimeToMake;
    private Integer DinnerItemID;

    // Getters and Setters
    public Integer getMenuItemID() {
        return MenuItemID;
    }

    public void setMenuItemID(Integer menuItemID) {
        this.MenuItemID = menuItemID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getTimeToMake() {
        return TimeToMake;
    }

    public void setTimeToMake(String timeToMake) {
        this.TimeToMake = timeToMake;
    }

    public Integer getDinnerItemID() {
        return DinnerItemID;
    }

    public void setDinnerItemID(Integer dinnerItemID) {
        this.DinnerItemID = dinnerItemID;
    }
}