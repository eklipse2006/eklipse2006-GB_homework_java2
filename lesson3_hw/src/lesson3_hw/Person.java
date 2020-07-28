package lesson3_hw;

import java.util.ArrayList;

public class Person {
    private ArrayList<String> phone;
    private String email;
    private String name;

    public Person(String phone, String email, String name) {
        this.phone = new ArrayList<>();
        this.phone.add(phone);
        this.email = email;
        this.name = name;
        }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
