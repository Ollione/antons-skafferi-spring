package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Table(name = "drink_order")
@IdClass(DrinkOrder.DrinkOrderId.class)
public class DrinkOrder {
    @Id
    private Integer drink_id;

    @Id
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "drink_id", insertable = false, updatable = false)
    private Drinks drink;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Orders order;

    // Getters and setters
    public Integer getDrink_id() {
        return drink_id;
    }

    public void setDrink_id(Integer drink_id) {
        this.drink_id = drink_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    // Composite key class
    public static class DrinkOrderId implements Serializable {
        private Integer drink_id;
        private Integer order_id;

        // Default constructor
        public DrinkOrderId() {}

        // Getters and setters
        public Integer getDrink_id() {
            return drink_id;
        }

        public void setDrink_id(Integer drink_id) {
            this.drink_id = drink_id;
        }

        public Integer getOrder_id() {
            return order_id;
        }

        public void setOrder_id(Integer order_id) {
            this.order_id = order_id;
        }

        // hashCode and equals methods
        @Override
        public int hashCode() {
            return drink_id.hashCode() + order_id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            DrinkOrderId that = (DrinkOrderId) obj;
            return drink_id.equals(that.drink_id) && order_id.equals(that.order_id);
        }
    }
}