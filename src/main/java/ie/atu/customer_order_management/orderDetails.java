package ie.atu.customer_order_management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class orderDetails {

    private int orderID;
    private int productID;
    private int quantity;
    private int customerID;

}
