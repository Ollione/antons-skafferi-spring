package se.antons_skafferi.repository;

import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Integer> {
    List<Role> findAll();
    Optional<Role> findById(int id);
}