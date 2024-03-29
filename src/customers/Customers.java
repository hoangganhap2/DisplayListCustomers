package customers;

import java.util.Date;

public class Customers {
    private String name ;
    private int age;
    private String address;
    private String images;

    public Customers() {
    }

    public Customers(String name, int age, String address, String images) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
