package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "food") //Sets the name of the table in the database cuz i swapped the names and yeeted in a new one.
public class Food {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer menu_item_id;
    private String name;
    private String description;
    private Time time_to_make;
    private Integer dinner_item_id;

    public Integer getMenu_item_id() {
        return menu_item_id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Time getTime_to_make() {
        return time_to_make;
    }
    public Integer getDinner_item_id() {
        return dinner_item_id;
    }
}