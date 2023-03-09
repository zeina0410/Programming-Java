package com.mycompany.mavenproject1;
public class Part extends ProductInfo{
    public String pmake;
    public String pmmodel;

    public Part() {
        super(null, 0, 0, 0);
        this.pmake=null;
        this.pmmodel=null;
    }
       
    public Part(String pmake, String pmmodel, String model, double price, int year, int aquantity) {
        super(model, price, year, aquantity);
        this.pmake = pmake;
        this.pmmodel = pmmodel;
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
