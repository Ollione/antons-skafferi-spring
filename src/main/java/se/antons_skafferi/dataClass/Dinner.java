package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Time;

/**
 * <h1>Dinner class</h1>
 * Represents a dinner entity in the database.
 */
@Entity
@Table(name = "dinner")
public class Dinner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dinnerId;
    private String name;
    private String description;
    private Time timeToMake;
    private String type;
    private Integer price;

    /**
     * getter used to get the dinner id
     * @return dinnerId
     */
    public Integer getDinnerId() {
        return dinnerId;
    }

    /**
     * setter used to set the dinner id
     * @param dinnerId The dinner id
     */
    public void setDinnerId(Integer dinnerId) {
        this.dinnerId = dinnerId;
    }

    /**
     * getter used to get the name of the dinner
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter used to set the name of the dinner
     * @param name The name of the dinner
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter used to get the description of the dinner
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter used to set the description of the dinner
     * @param description The description of the dinner
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter used to get the time it takes to make the dinner
     * @return timeToMake
     */
    public Time getTimeToMake() {
        return timeToMake;
    }

    /**
     * setter used to set the time it takes to make the dinner
     * @param timeToMake The time it takes to make the dinner
     */
    public void setTimeToMake(Time timeToMake) {
        this.timeToMake = timeToMake;
    }

    /**
     * getter used to get the type of the dinner
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * setter used to set the type of the dinner
     * @param type The type of the dinner
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter used to get the price of the dinner
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * setter used to set the price of the dinner
     * @param price The price of the dinner
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}