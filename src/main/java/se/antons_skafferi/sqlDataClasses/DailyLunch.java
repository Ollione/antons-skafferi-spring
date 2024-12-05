package se.antons_skafferi.sqlDataClasses;

import java.util.Date;

public class DailyLunch {
    private String name;
    private String description;
    private Date date;
    private Integer price;

    public DailyLunch(String name, String description, Date date, Integer price) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    // Getters and setters
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
