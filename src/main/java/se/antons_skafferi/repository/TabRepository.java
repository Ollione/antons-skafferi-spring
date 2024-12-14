package se.antons_skafferi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import se.antons_skafferi.dataClass.Tab;

import java.sql.Timestamp;
import java.util.List;

public interface TabRepository extends JpaRepository<Tab, Integer> {
    @Query("SELECT t FROM Tab t WHERE DATE(t.opened_at) = DATE(:opened_at)")
    List<Tab> findByOpened_at(Timestamp opened_at);

    List<Tab> findByStatus(Tab.Status status);

    @Query("SELECT t FROM Tab t WHERE t.table_number = :table_number")
    List<Tab> findByTable_number(Integer table_number);
}