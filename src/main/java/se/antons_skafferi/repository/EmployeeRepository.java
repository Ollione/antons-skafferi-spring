// EmployeeRepository.java
package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Employee;
import se.antons_skafferi.dataClass.Role;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();

    @Query("SELECT e FROM Employee e WHERE e.employee_id = :id")
    Optional<Employee> findById(int id);

    @Query("SELECT e FROM Employee e WHERE e.person.first_name LIKE %:name% OR e.person.last_name LIKE %:name%")
    List<Employee> findByName(String name);

    @Query("SELECT e.password FROM Employee e WHERE e.person.email = :email")
    String findPasswordByEmail(String email);

    @Query("SELECT r FROM Employee e JOIN e.role r WHERE e.employee_id = :employee_id")
    List<Role> findHierarchyByEmployeeId(int employee_id);

    @Query("SELECT CASE WHEN COUNT(e) > 0 THEN true ELSE false END FROM Employee e WHERE e.person.person_id = :personId")
    boolean existsByPersonId(int personId);
}