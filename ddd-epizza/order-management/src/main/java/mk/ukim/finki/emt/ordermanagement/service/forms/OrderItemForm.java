package mk.ukim.finki.emt.ordermanagement.service.forms;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class OrderItemForm {

    @NotNull
    private Pizza pizza;

    @Min(1)
    private int quantity = 1;
}
