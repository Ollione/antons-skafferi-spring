package se.antons_skafferi.sqlDataClasses;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface FoodRepository extends CrudRepository<Food, Integer> {
//    @Query("SELECT name, description FROM food")
//    List<Food> findAllFood();

    @Query("SELECT f FROM Food f JOIN ForLunch fl ON f.menu_item_id = fl.menu_item_id WHERE fl.date BETWEEN :startDate AND :endDate")
    List<Food> findLunch(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

//    @Query("SELECT l FROM Food f JOIN Lunch l ON f.menu_item_id = l.menu_item_id")
//    List<Food> findLunch();

    @Query("SELECT new se.antons_skafferi.sqlDataClasses.DailyLunch(f.name, f.description, fl.date, fl.price) " +
            "FROM Food f JOIN ForLunch fl ON f.menu_item_id = fl.menu_item_id")
    List<DailyLunch> findLunch();

}