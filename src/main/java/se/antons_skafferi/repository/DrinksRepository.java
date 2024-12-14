package se.antons_skafferi.repository;

import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Drinks;

import java.util.List;

public interface DrinksRepository extends CrudRepository<Drinks, Integer> {
    List<Drinks> findAll();
    Drinks findById(int id);
    List<Drinks> findByType(String type);
}