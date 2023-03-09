package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public abstract class ProductInfo {
    public String model;
    public double price;
    public int year;
    public int aquantity;
   
    public ProductInfo(){
        this.model = null;
        this.price = 0;
        this.year = 0;
        this.aquantity = 0;
    }
    
    public ProductInfo(String model, double price, int year, int aquantity) {
        this.model = model;
        this.price = price;
        this.year = year;
        this.aquantity = aquantity;
    }
    
    public boolean finished(){
        if(aquantity>0)
            return false;
        else 
            return true;
    }
    
    public abstract String viewcpm();
    public abstract double viewcpp();
}
