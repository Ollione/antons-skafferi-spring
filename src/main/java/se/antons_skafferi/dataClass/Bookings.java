package se.antons_skafferi.dataClass;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalTime;
import java.sql.Date;

@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    private Integer booking_id;
    private Date date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime start_time;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime end_time;

    private Integer table_number;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    // Getters and setters

    public Integer getBooking_id() {
        return booking_id;
    }
    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public LocalTime getStart_time() {
        return start_time;
    }
    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }
    public LocalTime getEnd_time() {
        return end_time;
    }
    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }
    public Integer getTable_number() {
        return table_number;
    }
    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public enum Status {
        Confirmed,
        Cancelled
    }
}