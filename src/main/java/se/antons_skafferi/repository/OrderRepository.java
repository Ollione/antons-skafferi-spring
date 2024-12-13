package se.antons_skafferi.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Bookings;
import se.antons_skafferi.dataClass.Orders;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

//    static void save(Orders order)

    List<Orders> findAll();
}
