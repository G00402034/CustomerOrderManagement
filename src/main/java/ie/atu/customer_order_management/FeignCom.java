package ie.atu.customer_order_management;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "verify-customer", url = "http://localhost:8082")
public interface FeignCom {

    @PostMapping("/verify")
    Map <String,String> userDetails(@RequestBody customerDetails customerDetails);

}
