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

/**
 * <h1>Tab class</h1>
 * Represents a tab entity in the database.
 */
@Entity
@Table(name = "tab")
public class Tab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    /**
     * Method to get the tab id.
     * @return tab_id
     */
    public Integer getTab_id() {
        return tab_id;
    }

    /**
     * Method to set the tab id.
     * @param tab_id The tab id.
     */
    public void setTab_id(Integer tab_id) {
        this.tab_id = tab_id;
    }

    /**
     * Method to get the opened at timestamp.
     * @return opened_at
     */
    public Timestamp getOpened_at() {
        return opened_at;
    }

    /**
     * Method to set the opened at timestamp.
     * @param opened_at The opened at timestamp.
     */
    public void setOpened_at(Timestamp opened_at) {
        this.opened_at = opened_at;
    }

    /**
     * Method to get the closed at timestamp.
     * @return closed_at
     */
    public Timestamp getClosed_at() {
        return closed_at;
    }

    /**
     * Method to set the closed at timestamp.
     * @param closed_at The closed at timestamp.
     */
    public void setClosed_at(Timestamp closed_at) {
        this.closed_at = closed_at;
    }

    /**
     * Method to get the last updated at timestamp.
     * @return last_updated_at
     */
    public Timestamp getLast_updated_at() {
        return last_updated_at;
    }

    /**
     * Method to set the last updated at timestamp.
     * @param last_updated_at The last updated at timestamp.
     */
    public void setLast_updated_at(Timestamp last_updated_at) {
        this.last_updated_at = last_updated_at;
    }

    /**
     * Method to get the status.
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Method to set the status.
     * @param status The status.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Method to get the table number.
     * @return table_number
     */
    public Integer getTable_number() {
        return table_number;
    }

    /**
     * Method to set the table number.
     * @param table_number The table number.
     */
    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }

    /**
     * Method to get the employee id.
     * @return employee_id
     */
    public Integer getEmployee_id() {
        return employee_id;
    }

    /**
     * Method to set the employee id.
     * @param employee_id The employee id.
     */
    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    /**
     * Method to get the table.
     * @return table
     */
    public Tables getTable() {
        return table;
    }

    /**
     * Method to set the table.
     * @param table The table.
     */
    public void setTable(Tables table) {
        this.table = table;
    }

    /**
     * Method to get the employee.
     * @return employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Method to set the employee.
     * @param employee The employee.
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * Enum to represent the status of a tab.
     */
    public enum Status {
        Open,
        Closed
    }
}