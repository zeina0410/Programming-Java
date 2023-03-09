package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.Date;
import java.util.ArrayList;
public class NewMain {
    public static ArrayList <ProductInfo> pro;
    public static ArrayList <Supplier> sup;
    public static ArrayList <Client> cos;
    public static void main(String[] args) {
        Supplier s1= new Supplier("hani", "sheik", "0953728352", "sup1", "1234");
        Supplier s2= new Supplier("layla", "zahr", "0984639264", "sup2", "5678");
        sup= new ArrayList <Supplier>();
        sup.add(s1);
        sup.add(s2);
        
        Date sd1= new Date(2021, 11, 30);
        Date ed1= new Date(2023, 11, 29);
        Date sd2= new Date(2020, 05, 15);
        Date ed2= new Date(2022, 05, 14);
        Card cr1= new Card (sd1, ed1, 5, 251000);
        Card cr2= new Card (sd2, ed2, 9, 504000);
        
        cos = new ArrayList <Client>();
        Client co1= new Client(29, cr2,"sup1", "jgdj@jhs.com", "hani", "sheik", "0953728352", "co1", "1234");
        Client co2= new Client(23, cr1, "sup2", "htduaj@hjj.com", "layla", "zahr", "0984639264", "co2", "5678");
        cos.add(co1);
        cos.add(co2);
        
        pro = new ArrayList <ProductInfo>();
        Part p1= new Part("Japan", "awdkhgfa", "kjhgfhg",15000,2000, 300);
        Part p2= new Part("Japan", "awdkhgfa", "kjhgfhg",15000,2005, 300);
        Part p3= new Part("Japan", "awdkhgfa", "kjhgfhg", 16000, 2013, 300);
        pro.add(p1);
        pro.add(p2);
        pro.add(p3);
       
        Part part1[]= new Part[3];
        part1[0]=p1;
        part1[1]=p2;
        part1[2]=p3;
        
        Car c1= new Car("audi1", "", 5000, part1,"rs7", 250000, 2018, 5);
        Car c2= new Car("audi2", "", 5000, part1 ,"rs7", 250000, 2020, 5);
        Car c3= new Car("audi3", "", 5000, part1  ,"rs7", 250000, 2013, 5);
        Car c4= new Car("audi4", "", 5000, part1  ,"rs7", 250000, 2016, 5);
        Car c5= new Car("audi5", "", 5000,  part1 ,"rs7", 250000, 2010, 5);
        pro.add(c1);
        pro.add(c2);
        pro.add(c3);
        pro.add(c4);
        pro.add(c5);
        
    }
}
