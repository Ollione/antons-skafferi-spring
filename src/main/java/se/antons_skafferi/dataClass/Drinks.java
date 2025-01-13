package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * <h1>Drinks class</h1>
 * Represents a drinks entity in the database.
 */
@Entity
@Table(name = "drinks")
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer drink_id;
    private String name;
    private String type;
    private String description;
    private Integer price;

    /**
     * getter used to get the drink id
     * @return drink_id
     */
    public Integer getDrink_id() {
        return drink_id;
    }

    /**
     * setter used to set the drink id
     * @param drink_id The drink id
     */
    public void setDrink_id(Integer drink_id) {
        this.drink_id = drink_id;
    }

    /**
     * getter used to get the name of the drink
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter used to set the name of the drink
     * @param name The name of the drink
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter used to get the type of the drink
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * setter used to set the type of the drink
     * @param type The type of the drink
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter used to get the description of the drink
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter used to set the description of the drink
     * @param description The description of the drink
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter used to get the price of the drink
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * setter used to set the price of the drink
     * @param price The price of the drink
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}