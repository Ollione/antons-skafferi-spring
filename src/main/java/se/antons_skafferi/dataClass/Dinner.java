package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Time;

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

    // Getters and setters
    public Integer getDinnerId() {
        return dinnerId;
    }

    public void setDinnerId(Integer dinnerId) {
        this.dinnerId = dinnerId;
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

    public Time getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(Time timeToMake) {
        this.timeToMake = timeToMake;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}