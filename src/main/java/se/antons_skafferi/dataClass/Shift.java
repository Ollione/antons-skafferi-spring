package se.antons_skafferi.dataClass;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * <h1>Shift class</h1>
 * Represents a shift entity in the database.
 */
@Entity
@Table(name = "shift")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schedule_id;
    private Date shift_date;
    private Time start_time;
    private Time end_time;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    /**
     * Method to get the schedule id.
     * @return schedule_id
     */
    public Integer getSchedule_id() {
        return schedule_id;
    }

    /**
     * Method to set the schedule id.
     * @param schedule_id The schedule id.
     */
    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    /**
     * Method to get the shift date.
     * @return shift_date
     */
    public Date getShift_date() {
        return shift_date;
    }

    /**
     * Method to set the shift date.
     * @param shift_date The shift date.
     */
    public void setShift_date(Date shift_date) {
        this.shift_date = shift_date;
    }

    /**
     * Method to get the start time.
     * @return start_time
     */
    public Time getStart_time() {
        return start_time;
    }

    /**
     * Method to set the start time.
     * @param start_time The start time.
     */
    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    /**
     * Method to get the end time.
     * @return end_time
     */
    public Time getEnd_time() {
        return end_time;
    }

    /**
     * Method to set the end time.
     * @param end_time The end time.
     */
    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    /**
     * Method to get the employee.
     * @return employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Method to set the employee.
     * @param employee The employee.
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}