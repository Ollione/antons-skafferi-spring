package se.antons_skafferi.repository;

import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Bookings;

import java.util.List;

public interface BookingRepository extends CrudRepository<Bookings, Integer> {
    List<Bookings> findAll();
}