package ie.atu.customer_order_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class customerController {
    private customerService customerService;
    private customerDetails customerDetails;

    @Autowired
    public void Inject(customerService(customerService){this.customerService = customerService;}

    @PostMapping("/addCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrderReciever(@RequestBody customerDetails customerDetails){customerService.createCustomer(customerDetails);}
    @PostMapping("/getCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList<orderDetails> getCustomerReciever(){return customerService.getCustomerByID();}
}
