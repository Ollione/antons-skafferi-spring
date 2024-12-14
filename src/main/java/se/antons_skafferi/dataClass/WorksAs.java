package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Table(name = "works_as")
@IdClass(WorksAs.WorksAsId.class)
public class WorksAs {
    @Id
    private Integer employee_id;

    @Id
    private Integer role_id;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;

    // Getters and setters
    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // Composite key class
    public static class WorksAsId implements Serializable {
        private Integer employee_id;
        private Integer role_id;

        // Default constructor
        public WorksAsId() {}

        // Getters and setters
        public Integer getEmployee_id() {
            return employee_id;
        }

        public void setEmployee_id(Integer employee_id) {
            this.employee_id = employee_id;
        }

        public Integer getRole_id() {
            return role_id;
        }

        public void setRole_id(Integer role_id) {
            this.role_id = role_id;
        }

        // hashCode and equals methods
        @Override
        public int hashCode() {
            return employee_id.hashCode() + role_id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            WorksAsId that = (WorksAsId) obj;
            return employee_id.equals(that.employee_id) && role_id.equals(that.role_id);
        }
    }
}