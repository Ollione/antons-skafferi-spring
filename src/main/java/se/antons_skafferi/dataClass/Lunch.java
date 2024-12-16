package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

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

    // Getters and setters
    public Integer getLunchId() {
        return lunchId;
    }

    public void setLunchId(Integer lunchId) {
        this.lunchId = lunchId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<LunchItems> getLunchItems() {
        return lunchItems;
    }

    public void setLunchItems(List<LunchItems> lunchItems) {
        this.lunchItems = lunchItems;
    }
}