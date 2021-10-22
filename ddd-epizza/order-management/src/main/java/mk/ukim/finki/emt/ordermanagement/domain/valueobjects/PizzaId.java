package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class PizzaId extends DomainObjectId {

    private PizzaId() {
        super(PizzaId.randomId(PizzaId.class).getId());
    }

    public PizzaId(String uuid) {
        super(uuid);
    }

}
