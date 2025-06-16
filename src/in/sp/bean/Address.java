package in.sp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("450112")
    private int pincode;
    @Value("indore")
    private String city;
    @Value("MP")
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                ", state='" + state + '\'' +
                '}';
    }
}
