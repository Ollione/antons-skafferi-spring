package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.antons_skafferi.dataClass.Employee;
import se.antons_skafferi.dataClass.Role;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();

    @Query("SELECT e FROM Employee e WHERE e.employee_id = :id")
    Employee findById(int id);

    @Query("SELECT e FROM Employee e WHERE e.person.first_name LIKE %:name% OR e.person.last_name LIKE %:name%")
    List<Employee> findByName(String name);

    @Query("SELECT e.password FROM Employee e WHERE e.person.email = :email")
    String findPasswordByEmail(String email);

    @Query("SELECT r FROM Role r JOIN WorksAs wa ON r.role_id = wa.role_id WHERE wa.employee_id = :employee_id ORDER BY r.hierarchy_level")
    List<Role> findHierarchyByEmployeeId(int employee_id);
}