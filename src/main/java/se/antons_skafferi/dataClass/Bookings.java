package se.antons_skafferi.dataClass;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalTime;
import java.sql.Date;

/**
 * <h1>Bookings</h1>
 * This class represents the bookings table in the database.
 */
@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer booking_id;
    private Date date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime start_time;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime end_time;

    private Integer table_number;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Integer person_id;

    @ManyToOne
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private Person person;

    /**
     * Method to get the booking id.
     * @return booking_id
     */
    public Integer getBooking_id() {
        return booking_id;
    }

    /**
     * Method to set the booking id.
     * @param booking_id The booking id.
     */
    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }

    /**
     * Method to get the date.
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Method to set the date.
     * @param date The date.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Method to get the start time.
     * @return start_time
     */
    public LocalTime getStart_time() {
        return start_time;
    }

    /**
     * Method to set the start time.
     * @param start_time The start time.
     */
    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    /**
     * Method to get the end time.
     * @return end_time
     */
    public LocalTime getEnd_time() {
        return end_time;
    }

    /**
     * Method to set the end time.
     * @param end_time The end time.
     */
    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    /**
     * Method to get the table number.
     * @return table_number
     */
    public Integer getTable_number() {
        return table_number;
    }

    /**
     * Method to set the table number.
     * @param table_number The table number.
     */
    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }

    /**
     * Method to get the status.
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Method to set the status.
     * @param status The status.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Method to get the person id.
     * @return person_id
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Method to set the person id.
     * @param person The person id.
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Method to get the person id.
     * @return person_id
     */
    public Integer getPerson_id() {
        return person_id;
    }

    /**
     * Method to set the person id.
     * @param person_id The person id.
     */
    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    /**
     * Enum to represent the status of the booking.
     */
    public enum Status {
        Confirmed,
        Cancelled
    }
}