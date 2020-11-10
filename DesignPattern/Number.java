package DesignPattern;

import java.io.Serializable;

public class Number implements Serializable {

    private static final long serialVersionUID = 5191597428084090524L;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
