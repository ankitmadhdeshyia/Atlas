package com.springcoreLifecycle;

public class Ankit {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
         System.out.println("Setting Price");
        this.price = price;
    }

    public Ankit(double price) {
       
        this.price = price;
    }
    

    public Ankit() {
    }

    @Override
    public String toString() {
        return "Ankit [price=" + price + "]";
    }
    public void init(){
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("Destroying");
    }

    
}
