package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

/**
 * <h1>FoodOrder</h1>
 * This class represents the food_order table in the database.
 */
@Entity
@Table(name = "food_order")
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonBackReference
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "dinner_id")
    private Dinner dinner;

    private String note;

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
     * Getter to get the dinner.
     * @return dinner
     */
    public Dinner getDinner() {
        return dinner;
    }

    /**
     * Setter to set the dinner.
     * @param dinner The dinner.
     */
    public void setDinner(Dinner dinner) {
        this.dinner = dinner;
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
     * Getter to get the note.
     * @return note
     */
    public String getNote() {return note;}

    /**
     * Setter to set the note.
     * @param note The note.
     */
    public void setNote(String note) {this.note = note;}
}