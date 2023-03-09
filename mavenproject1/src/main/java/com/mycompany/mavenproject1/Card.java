package com.mycompany.mavenproject1;
import java.util.Date;
public class Card {
    static int c=0;
    public int cardnum;
    public Date startdate;
    public Date enddate;
    public int buyamount;
    public String memtype;
    public double cost;

    public Card(){
        this.startdate = null;
        this.enddate = null;
        this.buyamount = 0;
        this.cost = 0;
        this.cardnum=0;
        this.memtype=null;
    }
    
    public Card(Date startdate, Date enddate, int buyamount, double cost) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.buyamount = buyamount;
        this.cost = cost;
        cardnum = c++;
        
        if(buyamount>=2500000)
            memtype="silver";
        else if(buyamount>=5000000)
           memtype="gold";
        else
            memtype="no spesial membership";
        
        if(memtype=="silver")
            cost=cost-(cost*(2.5/100));
        else if (memtype=="gold")
            cost=cost-(cost*(5/100));
        else
            cost=cost;
    }

    public boolean checkav(int cardnum){
        Date date= new Date();
        if(this.cardnum==cardnum){
            if(date.compareTo(enddate)<=0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    
}
