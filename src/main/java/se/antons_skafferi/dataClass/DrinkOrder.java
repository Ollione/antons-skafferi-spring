package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

/**
 * <h1>DrinkOrder</h1>
 * This class represents the drink_order table in the database.
 */
@Entity
@Table(name = "drink_order")
public class DrinkOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "drink_id", nullable = false)
    private Drinks drink;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    @JsonBackReference
    private Orders order;

    private Integer quantity;

    /**
     * Getter to get the id.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter to set the id.
     * @param id The id.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter to get the drink.
     * @return drink
     */
    public Drinks getDrink() {
        return drink;
    }

    /**
     * Setter to set the drink.
     * @param drink The drink.
     */
    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    /**
     * Getter to get the order.
     * @return order
     */
    public Orders getOrder() {
        return order;
    }

    /**
     * Setter to set the order.
     * @param order The order.
     */
    public void setOrder(Orders order) {
        this.order = order;
    }

    /**
     * Getter to get the quantity.
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter to set the quantity.
     * @param quantity The quantity.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}