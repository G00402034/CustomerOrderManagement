package ie.atu.customer_order_management;

import java.util.ArrayList;

public class orderService {
    ArrayList<orderDetails> ordersSheet = new ArrayList<>();
    public void createOrder (orderDetails orderDetails){ordersSheet.add(orderDetails);}
    public void Arraylist <orderDetails> getOrderByid(){return ordersSheet;}
}
