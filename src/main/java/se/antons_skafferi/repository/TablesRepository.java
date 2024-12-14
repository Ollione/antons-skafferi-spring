package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Tables;

import java.util.List;

public interface TablesRepository extends CrudRepository<Tables, Integer> {
    List<Tables> findAll();

    @Query("SELECT t FROM Tables t WHERE t.table_number = :id")
    Tables findById(int id);

    @Query("SELECT t FROM Tables t WHERE t.room_for_people = :room_for_people")
    List<Tables> findByRoom_for_people(int room_for_people);
}