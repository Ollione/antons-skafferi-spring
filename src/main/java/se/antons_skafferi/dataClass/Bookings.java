// Bookings.java
package se.antons_skafferi.dataClass;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalTime;
import java.sql.Date;

@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer booking_id;
    private Date date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime start_time;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime end_time;

    private Integer table_number;
    private String status;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    // Getters and setters

    public Integer getBooking_id() {
        return booking_id;
    }
    public Date getDate() {
        return date;
    }
    public LocalTime getStart_time() {
        return start_time;
    }
    public LocalTime getEnd_time() {
        return end_time;
    }
    public Integer getTable_number() {
        return table_number;
    }
    public String getStatus() {
        return status;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}