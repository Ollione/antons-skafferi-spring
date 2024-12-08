package se.antons_skafferi.sqlDataClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.sql.Time;
import java.sql.Date;

@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer booking_id;
    private Date date;
    private Time start_time;
    private Time end_time;
    private Integer table_number;
    private String status;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Integer getBooking_id() {
        return booking_id;
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
    public Integer getTable_number() {
        return table_number;
    }
    public String getStatus() {
        return status;
    }
    public Person getPerson() {
        return person;
    }
}