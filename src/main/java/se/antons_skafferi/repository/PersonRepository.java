package se.antons_skafferi.repository;

import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}