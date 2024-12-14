package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import java.sql.Timestamp;

@Entity
@Table(name = "tab")
public class Tab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tab_id;
    private Timestamp opened_at;
    private Timestamp closed_at;
    private Timestamp last_updated_at;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Integer table_number;
    private Integer employee_id;

    @ManyToOne
    @JoinColumn(name = "table_number", insertable = false, updatable = false)
    private Tables table;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    // Getters and setters
    public Integer getTab_id() {
        return tab_id;
    }

    public void setTab_id(Integer tab_id) {
        this.tab_id = tab_id;
    }

    public Timestamp getOpened_at() {
        return opened_at;
    }

    public void setOpened_at(Timestamp opened_at) {
        this.opened_at = opened_at;
    }

    public Timestamp getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(Timestamp closed_at) {
        this.closed_at = closed_at;
    }

    public Timestamp getLast_updated_at() {
        return last_updated_at;
    }

    public void setLast_updated_at(Timestamp last_updated_at) {
        this.last_updated_at = last_updated_at;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getTable_number() {
        return table_number;
    }

    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Tables getTable() {
        return table;
    }

    public void setTable(Tables table) {
        this.table = table;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public enum Status {
        Open,
        Closed
    }
}