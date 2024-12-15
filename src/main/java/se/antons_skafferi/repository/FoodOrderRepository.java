package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.antons_skafferi.dataClass.FoodOrder;
import se.antons_skafferi.dataClass.Orders;
import se.antons_skafferi.dataClass.Dinner;

import java.util.Optional;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {
    Optional<FoodOrder> findByOrderAndDinner(Orders order, Dinner dinner);
}