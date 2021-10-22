package mk.ukim.finki.emt.ordermanagement.service.forms;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Data
public class OrderForm {

    @NotNull
    private Currency currency;
    
    private List<OrderItemForm> items = new ArrayList<>();
}
