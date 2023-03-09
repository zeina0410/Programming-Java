package com.mycompany.mavenproject1;
public class Car extends ProductInfo{
    public String brand;
    public String engine;
    public int horsepower;
    public Part parts[];

    public Car() {
        super(null, 0, 0, 0);
        this.brand=null;
        this.engine=null;
        this.horsepower=0;
        this.parts=null;
    }    
    
    public Car(String brand, String engine, int horsepower, Part[] parts, String model, double price, int year, int aquantity) {
        super(model, price, year, aquantity);
        this.brand = brand;
        this.engine = engine;
        this.horsepower = horsepower;
        this.parts = parts;
    }

    public Car(String brand, String engine, int horsepower, String model, double price, int year, int aquantity) {
        super(model, price, year, aquantity);
        this.brand = brand;
        this.engine = engine;
        this.horsepower = horsepower;
    }
    
    @Override
    public String viewcpm() {
        if(!finished())
            return this.model;
        return null;
    }
    
    @Override
    public double viewcpp() {
        if(!finished())
            return this.price;
        return 0;
    }
    
}
