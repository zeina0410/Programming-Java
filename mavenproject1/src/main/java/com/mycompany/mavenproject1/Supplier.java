package com.mycompany.mavenproject1;
public class Supplier extends NameAndPhone{
    public Supplier(){
        super(null, null, null, null, null);
    }
    
    public Supplier(String fname, String lname, String phone, String username, String password) {
        super(fname, lname, phone, username, password);
    }
    
}
