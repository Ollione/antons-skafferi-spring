package se.antons_skafferi.dataClass;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "lunch")
public class Lunch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lunchId;
    private Integer price;
    private Date date;

    @OneToMany(mappedBy = "lunch", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Items> items;

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

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}