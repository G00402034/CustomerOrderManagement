package ie.atu.customer_order_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerOrderManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerOrderManagementApplication.class, args);
    }

}
