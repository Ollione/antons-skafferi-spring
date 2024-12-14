package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Bookings;

import java.sql.Date;
import java.util.List;

public interface BookingRepository extends CrudRepository<Bookings, Integer> {
    List<Bookings> findAll();

    List<Bookings> findByDate(Date date);

    @Query("SELECT b FROM Bookings b WHERE WEEK(b.date) = :week AND YEAR(b.date) = :year")
    List<Bookings> findByWeekAndYear(int week, int year);
}