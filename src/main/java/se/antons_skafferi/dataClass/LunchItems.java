// LunchItems.java
package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "lunch_items")
public class LunchItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "lunch_id", nullable = false)
    @JsonBackReference
    private Lunch lunch;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Items item;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }
}