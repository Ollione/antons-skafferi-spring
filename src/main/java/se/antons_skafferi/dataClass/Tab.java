package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.sql.Date;

@Entity
@Table(name = "tab")
public class Tab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tab_id;
    private Integer table_number;
    private Integer employee_id;
    private Date opened_at;
    private Date closed_at;
    private String status;
    private Date last_updated_at;

    @ManyToOne
    @JoinColumn(name = "table_number", insertable = false, updatable = false)
    private Tables table;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    public Integer getTab_id() {
        return tab_id;
    }

    public Integer getTable_number() {
        return table_number;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public Date getOpened_at() {
        return opened_at;
    }

    public Date getClosed_at() {
        return closed_at;
    }

    public String getStatus() {
        return status;
    }

    public Date getLast_updated_at() {
        return last_updated_at;
    }

    public Tables getTable() {
        return table;
    }

    public Employee getEmployee() {
        return employee;
    }
}