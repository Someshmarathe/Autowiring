package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("1")
    private int id;
    @Value("somesh")
    private String name;
    @Value("somesh@gmail.com")
    private String email;
    @Autowired
    private Address address;


    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
