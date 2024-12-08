package se.antons_skafferi.sqlDataClasses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Bookings, Integer> {
    List<Bookings> findAll();
}