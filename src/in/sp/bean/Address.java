package in.sp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {

    private int pincode;

    private String city;

    private String state;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                ", state='" + state + '\'' +
                '}';
    }
}
