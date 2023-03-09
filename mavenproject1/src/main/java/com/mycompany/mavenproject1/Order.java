package com.mycompany.mavenproject1;
import java.util.Date;
public class Order {
    public Date d;
    public int Can;
    public String p;
    double tcost;

    public Order() {
        this.d = null;
        this.Can = 0;
        this.p = null;
        this.tcost = 0;
    }
    
    public Order(Date d, int Can, String p, double tcost) {
        this.d = d;
        this.Can = Can;
        this.p = p;
        this.tcost = tcost;
    }
    
    
}
