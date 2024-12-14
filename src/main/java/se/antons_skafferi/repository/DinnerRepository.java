package se.antons_skafferi.repository;

import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Dinner;

import java.util.List;

public interface DinnerRepository extends CrudRepository<Dinner, Integer> {
    List<Dinner> findAll();


    List<Dinner> findByType(String type);


}