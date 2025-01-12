package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * <h1>Lunch</h1>
 * This class represents the lunch table in the database.
 */
@Entity
@Table(name = "lunch")
public class Lunch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lunchId;
    private Integer price;
    private Date date;

    @OneToMany(mappedBy = "lunch", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<LunchItems> lunchItems;

    /**
     * Getter to get the lunchId.
     * @return lunchId
     */
    public Integer getLunchId() {
        return lunchId;
    }

    /**
     * Setter to set the lunchId.
     * @param lunchId The lunchId.
     */
    public void setLunchId(Integer lunchId) {
        this.lunchId = lunchId;
    }

    /**
     * Getter to get the price.
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Setter to set the price.
     * @param price The price.
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Getter to get the date.
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter to set the date.
     * @param date The date.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter to get the lunchItems.
     * @return lunchItems
     */
    public List<LunchItems> getLunchItems() {
        return lunchItems;
    }

    /**
     * Setter to set the lunchItems.
     * @param lunchItems The lunchItems.
     */
    public void setLunchItems(List<LunchItems> lunchItems) {
        this.lunchItems = lunchItems;
    }
}