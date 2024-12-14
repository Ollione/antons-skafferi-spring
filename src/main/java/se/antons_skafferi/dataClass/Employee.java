package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private Integer employee_id;
    private Date hiring_date;
    private Integer salary;
    private String password;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Integer getEmployee_id() {
        return employee_id;
    }

    public Date getHiring_date() {
        return hiring_date;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getPassword() {
        return password;
    }

    public Person getPerson() {
        return person;
    }
}