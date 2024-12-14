package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tables")
public class Tables {
    @Id
    private Integer table_number;
    private Integer room_for_people;

    // Getters and setters
    public Integer getTable_number() {
        return table_number;
    }

    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }

    public Integer getRoom_for_people() {
        return room_for_people;
    }

    public void setRoom_for_people(Integer room_for_people) {
        this.room_for_people = room_for_people;
    }
}