package ie.atu.customer_order_management;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class orderService {
    ArrayList<orderDetails> ordersSheet = new ArrayList<>();
    public void createOrder (orderDetails orderDetails){ordersSheet.add(orderDetails);}
    public void Arraylist <orderDetails> getOrderByid(){return ordersSheet;}
}
