// Employee.java
package se.antons_skafferi.dataClass;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    private Date hiring_date;
    private Integer salary;
    private String password;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    // Getters and setters
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

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}