package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

/**
 * <h1>WorksShift class</h1>
 * Represents a works_shift entity in the database.
 */
@Entity
@Table(name = "works_shift")
@IdClass(WorksShift.WorksShiftId.class)
public class WorksShift {
    @Id
    private Integer schedule_id;

    @Id
    private Integer employee_id;

    @ManyToOne
    @JoinColumn(name = "schedule_id", insertable = false, updatable = false)
    private Shift shift;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    /**
     * Method to get the schedule id.
     * @return schedule_id
     */
    public Integer getSchedule_id() {
        return schedule_id;
    }

    /**
     * Method to set the schedule id.
     * @param schedule_id The schedule id.
     */
    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
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
     * Method to get the shift.
     * @return shift
     */
    public Shift getShift() {
        return shift;
    }

    /**
     * Method to set the shift.
     * @param shift The shift.
     */
    public void setShift(Shift shift) {
        this.shift = shift;
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

    // Composite key class. was needed to make the composite key work. This is kinda legacy code.
    // Now we can just use the @ for the tags but in general this kind of section isnt used cuz we are using goodle calender.
    // It was earlier in the project. SO dont dont remember the exact details but we keep it here for now.
    /**
     * <h1>WorksShiftId class</h1>
     * Represents a composite key for the works_shift entity in the database.
     */
    public static class WorksShiftId implements Serializable {
        private Integer schedule_id;
        private Integer employee_id;

        /**
         * Constructor for the WorksShiftId class.
         */
        public WorksShiftId() {}

        /**
         * getter for the schedule_id.
         * @return schedule_id
         */
        public Integer getSchedule_id() {
            return schedule_id;
        }

        /**
         * setter for the schedule_id.
         * @param schedule_id The schedule id.
         */
        public void setSchedule_id(Integer schedule_id) {
            this.schedule_id = schedule_id;
        }

        /**
         * getter for the employee_id.
         * @return employee_id
         */
        public Integer getEmployee_id() {
            return employee_id;
        }

        /**
         * setter for the employee_id.
         * @param employee_id The employee id.
         */
        public void setEmployee_id(Integer employee_id) {
            this.employee_id = employee_id;
        }

        /**
         * Method to get the hash code.
         * @return hash code
         */
        @Override
        public int hashCode() {
            return schedule_id.hashCode() + employee_id.hashCode();
        }

        /**
         * Method to check if two objects are equal.
         * @param obj The object to compare with.
         * @return boolean
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            WorksShiftId that = (WorksShiftId) obj;
            return schedule_id.equals(that.schedule_id) && employee_id.equals(that.employee_id);
        }
    }
}