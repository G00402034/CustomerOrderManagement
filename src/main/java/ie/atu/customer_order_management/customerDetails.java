package ie.atu.customer_order_management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class customerDetails {

    private String name;
    private String email;
    private int customerID;
    private int age;

}
