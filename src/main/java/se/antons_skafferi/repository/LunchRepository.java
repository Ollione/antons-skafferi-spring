package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Lunch;

import java.sql.Date;
import java.util.List;

public interface LunchRepository extends CrudRepository<Lunch, Integer> {
    @Query("SELECT l FROM Lunch l LEFT JOIN FETCH l.items")
    List<Lunch> findAllWithItems();

    @Query("SELECT l FROM Lunch l LEFT JOIN FETCH l.items WHERE l.date = :date")
    List<Lunch> findByDate(Date date);

    @Query("SELECT l FROM Lunch l LEFT JOIN FETCH l.items WHERE WEEK(l.date) = :week AND YEAR(l.date) = :year")
    List<Lunch> findByWeekAndYear(int week, int year);

}