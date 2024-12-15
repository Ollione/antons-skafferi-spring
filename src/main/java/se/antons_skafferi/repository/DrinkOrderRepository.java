package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.antons_skafferi.dataClass.DrinkOrder;
import se.antons_skafferi.dataClass.Orders;
import se.antons_skafferi.dataClass.Drinks;

import java.util.Optional;

public interface DrinkOrderRepository extends JpaRepository<DrinkOrder, Integer> {
    Optional<DrinkOrder> findByOrderAndDrink(Orders order, Drinks drink);
}