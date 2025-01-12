package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * <h1>Tables class</h1>
 * Represents a table entity in the database.
 */
@Entity
@Table(name = "tables")
public class Tables {
    @Id
    private Integer table_number;
    private Integer room_for_people;

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
     * Method to get the room for people.
     * @return room_for_people
     */
    public Integer getRoom_for_people() {
        return room_for_people;
    }

    /**
     * Method to set the room for people.
     * @param room_for_people The room for people.
     */
    public void setRoom_for_people(Integer room_for_people) {
        this.room_for_people = room_for_people;
    }
}