package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * <h1>Role class</h1>
 * Represents a role entity in the database.
 */
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;
    private String name;
    private String description;
    private Integer hierarchy_level;

    /**
     * getter used to get the role id
     * @return role_id
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     * setter used to set the role id
     * @param role_id The role id
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    /**
     * getter used to get the name of the role
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter used to set the name of the role
     * @param name The name of the role
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter used to get the description of the role
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter used to set the description of the role
     * @param description The description of the role
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter used to get the hierarchy level of the role
     * @return hierarchy_level
     */
    public Integer getHierarchy_level() {
        return hierarchy_level;
    }

    /**
     * setter used to set the hierarchy level of the role
     * @param hierarchy_level The hierarchy level of the role
     */
    public void setHierarchy_level(Integer hierarchy_level) {
        this.hierarchy_level = hierarchy_level;
    }
}