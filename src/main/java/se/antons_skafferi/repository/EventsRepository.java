package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Events;

import java.sql.Date;
import java.util.List;

public interface EventsRepository extends CrudRepository<Events, Integer> {
    List<Events> findAll();

    @Query("SELECT e FROM Events e WHERE WEEK(e.date) = :week AND YEAR(e.date) = :year")
    List<Events> findByWeekAndYear(int week, int year);

    List<Events> findByDate(Date date);
}