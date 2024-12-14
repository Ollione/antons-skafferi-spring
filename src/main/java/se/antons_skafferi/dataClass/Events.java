package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "events")
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer event_id;
    private String name;
    private String description;
    private Date date;
    private Time start_time;
    private Time end_time;

    // Getters
    public Integer getEvent_id() {
        return event_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Time getStart_time() {
        return start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    // Setters
    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }
}