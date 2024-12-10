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
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer order_id;
    private Integer table_number;
    private Integer employee_id;
    private Date date;
    private String status;
    private Integer tab_id;

    @ManyToOne
    @JoinColumn(name = "table_number", insertable = false, updatable = false)
    private Tables table;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "tab_id", insertable = false, updatable = false)
    private Tab tab;

    public Integer getOrder_id() {
        return order_id;
    }

    public Integer getTable_number() {
        return table_number;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Integer getTab_id() {
        return tab_id;
    }

    public Tables getTable() {
        return table;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Tab getTab() {
        return tab;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTab_id(Integer tab_id) {
        this.tab_id = tab_id;
    }

    public void setTable(Tables table) {
        this.table = table;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setTab(Tab tab) {
        this.tab = tab;
    }
}