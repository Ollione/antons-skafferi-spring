package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;

/**
 * <h1>Events class</h1>
 * Represents an event entity in the database.
 */
@Entity
@Table(name = "events")
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_id;
    private String name;
    private String description;
    private Date date;
    private Time start_time;
    private Time end_time;

    /**
     * getter used to get the event id
     * @return event_id
     */
    public Integer getEvent_id() {
        return event_id;
    }

    /**
     * getter used to get the name of the event
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getter used to get the description of the event
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * getter used to get the date of the event
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * getter used to get the start time of the event
     * @return start_time
     */
    public Time getStart_time() {
        return start_time;
    }

    /**
     * getter used to get the end time of the event
     * @return end_time
     */
    public Time getEnd_time() {
        return end_time;
    }

    /**
     * setter used to set the event id
     * @param event_id The event id
     */
    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    /**
     * setter used to set the name of the event
     * @param name The name of the event
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter used to set the description of the event
     * @param description The description of the event
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * setter used to set the date of the event
     * @param date The date of the event
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * setter used to set the start time of the event
     * @param start_time The start time of the event
     */
    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    /**
     * setter used to set the end time of the event
     * @param end_time The end time of the event
     */
    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }
}