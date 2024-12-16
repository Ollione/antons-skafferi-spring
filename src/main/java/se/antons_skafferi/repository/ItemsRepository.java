package se.antons_skafferi.repository;

import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Items;

import java.util.List;

public interface ItemsRepository extends CrudRepository<Items, Integer> {
    List<Items> findAll();
}