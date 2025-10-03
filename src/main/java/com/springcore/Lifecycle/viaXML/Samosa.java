package com.springcore.Lifecycle.viaXML;

public class Samosa {
    private double price;
    private String shop;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting the price");
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        System.out.println("Setting the shop name");
        this.shop = shop;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "This is to string : "+
                "Samosa{" +
                "price=" + price +
                ", shop='" + shop + '\'' +
                '}';
    }
//    we need to do xml configuration to tell spring that these are "init" and "destroy" lifecycle methods
    public void init(){//it is not compulsion to name it as "init" when using xml configuration method
        System.out.println("Inside init()");
    }
    public void destroy(){//same working as init for xml configuration
        System.out.println("Destroying........");
    }
}
