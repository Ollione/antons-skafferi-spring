package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tables")
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer table_number;
    private Integer room_for_people;

    public Integer getTable_number() {
        return table_number;
    }

    public Integer getRoom_for_people() {
        return room_for_people;
    }
}