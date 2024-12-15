// Items.java
package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer item_id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<LunchItems> lunchItems;

    // Getters and setters
    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LunchItems> getLunchItems() {
        return lunchItems;
    }

    public void setLunchItems(List<LunchItems> lunchItems) {
        this.lunchItems = lunchItems;
    }
}