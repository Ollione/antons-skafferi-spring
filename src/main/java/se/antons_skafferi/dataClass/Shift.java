package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "shift", uniqueConstraints = @UniqueConstraint(columnNames = "employee_id"))
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer schedule_id;
    private Date shift_date;
    private Time start_time;
    private Time end_time;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false, unique = true)
    private Employee employee;

    // Getters and setters
    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Date getShift_date() {
        return shift_date;
    }

    public void setShift_date(Date shift_date) {
        this.shift_date = shift_date;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}