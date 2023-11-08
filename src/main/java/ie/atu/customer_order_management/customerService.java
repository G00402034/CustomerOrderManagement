package ie.atu.customer_order_management;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class customerService {
    ArrayList<customerDetails> customerSheet = new ArrayList<>();
    public void createCustomer(customerDetails customerDetails){customerSheet.add(customerDetails);}
    public void Arraylist <customerDetails> getcustomerByID(){return customerSheet;}

}
