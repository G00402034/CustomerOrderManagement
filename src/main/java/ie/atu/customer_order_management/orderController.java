package ie.atu.customer_order_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class orderController {

    private orderService orderService;
    private orderDetails orderDetails;

    @Autowired
    public void Inject(orderService(rderService){this.orderService = orderService;}

    @PostMapping("/addOrder")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrderReciever(@RequestBody orderDetails orderDetails){orderService.createOrder(orderDetails);}

    @PostMapping("/getorder")
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList <orderDetails> getOrderReciever(){return orderService.getOrderByid();}

}
