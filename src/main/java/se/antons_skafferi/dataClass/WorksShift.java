package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

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

    // Getters and setters
    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Composite key class
    public static class WorksShiftId implements Serializable {
        private Integer schedule_id;
        private Integer employee_id;

        // Default constructor
        public WorksShiftId() {}

        // Getters and setters
        public Integer getSchedule_id() {
            return schedule_id;
        }

        public void setSchedule_id(Integer schedule_id) {
            this.schedule_id = schedule_id;
        }

        public Integer getEmployee_id() {
            return employee_id;
        }

        public void setEmployee_id(Integer employee_id) {
            this.employee_id = employee_id;
        }

        // hashCode and equals methods
        @Override
        public int hashCode() {
            return schedule_id.hashCode() + employee_id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            WorksShiftId that = (WorksShiftId) obj;
            return schedule_id.equals(that.schedule_id) && employee_id.equals(that.employee_id);
        }
    }
}