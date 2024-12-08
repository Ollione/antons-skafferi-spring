package se.antons_skafferi.sqlDataClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer role_id;
    private String name;
    private String description;
    private Integer hierarchy_level;

    public Integer getRole_id() {
        return role_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getHierarchy_level() {
        return hierarchy_level;
    }
}