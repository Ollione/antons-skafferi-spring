package se.antons_skafferi.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Table(name = "food_order")
@IdClass(FoodOrder.FoodOrderId.class)
public class FoodOrder {
    @Id
    private Integer dinner_id;

    @Id
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "dinner_id", insertable = false, updatable = false)
    private Dinner dinner;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Orders order;

    // Getters and setters
    public Integer getDinner_id() {
        return dinner_id;
    }

    public void setDinner_id(Integer dinner_id) {
        this.dinner_id = dinner_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Dinner getDinner() {
        return dinner;
    }

    public void setDinner(Dinner dinner) {
        this.dinner = dinner;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    // Composite key class
    public static class FoodOrderId implements Serializable {
        private Integer dinner_id;
        private Integer order_id;

        // Default constructor
        public FoodOrderId() {}

        // Getters and setters
        public Integer getDinner_id() {
            return dinner_id;
        }

        public void setDinner_id(Integer dinner_id) {
            this.dinner_id = dinner_id;
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
            return dinner_id.hashCode() + order_id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            FoodOrderId that = (FoodOrderId) obj;
            return dinner_id.equals(that.dinner_id) && order_id.equals(that.order_id);
        }
    }
}