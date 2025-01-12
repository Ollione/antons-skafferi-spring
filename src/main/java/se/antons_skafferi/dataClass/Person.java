package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.sql.Date;

/**
 * <h1>Person class</h1>
 * Represents a person entity in the database.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer person_id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone_number; // Ensure this matches the method name in the repository

    /**
     * getter used to get the person id
     * @return person_id
     */
    public Integer getPerson_id() {
        return person_id;
    }

    /**
     * setter used to set the person id
     * @param person_id The person id
     */
    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    /**
     * getter used to get the first name of the person
     * @return first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * setter used to set the first name of the person
     * @param first_name The first name of the person
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * getter used to get the last name of the person
     * @return last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * setter used to set the last name of the person
     * @param last_name The last name of the person
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * getter used to get the date of birth of the person
     * @return date_of_birth
     */
    public Date getDate_of_birth() {
        return date_of_birth;
    }

    /**
     * setter used to set the date of birth of the person
     * @param date_of_birth The date of birth of the person
     */
    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    /**
     * getter used to get the email of the person
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter used to set the email of the person
     * @param email The email of the person
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter used to get the phone number of the person
     * @return phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * setter used to set the phone number of the person
     * @param phone_number The phone number of the person
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}