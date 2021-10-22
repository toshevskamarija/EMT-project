package mk.ukim.finki.emt.pizzacatalog.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.pizzacatalog.domain.valueobjects.Quantity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.*;

@Entity
@Table(name="pizza")
@Getter

public class Pizza extends AbstractEntity<PizzaId> {
    private String pizzaName;

    private Quantity quantity;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="price_amount")),
            @AttributeOverride(name="currency", column = @Column(name="price_currency"))
    })
    private Money price;

    private Pizza() {
        super(PizzaId.randomId(PizzaId.class));
    }

    public static Pizza build(String pizzaName, Money price, Quantity quantity) {
        Pizza p = new Pizza();
        p.pizzaName = pizzaName;
        p.price = price;
        p.quantity=quantity;
        return p;
    }

    public void changePrice(Money price) {
        this.price = price;
    }

}
