package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer person_id;
    private String first_name;
    private String last_name;
    private java.sql.Date date_of_birth;
    private String email;
    private String phone_number;

    public Integer getPerson_id() {
        return person_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public java.sql.Date getDate_of_birth() {
        return date_of_birth;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone_number() {
        return phone_number;
    }
}