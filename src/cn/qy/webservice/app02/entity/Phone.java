package cn.qy.webservice.app02.entity;

public class Phone {
    private String os;
    private String brand;
    private Double price;

    public Phone(String os, String brand, Double price) {
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
