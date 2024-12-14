package se.antons_skafferi.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Bookings;
import se.antons_skafferi.dataClass.Orders;

import java.sql.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

//    static void save(Orders order)

    List<Orders> findAll();

    List<Orders> findByDate(Date date);

    List<Orders> findByStatus(Orders.Status status);
}
