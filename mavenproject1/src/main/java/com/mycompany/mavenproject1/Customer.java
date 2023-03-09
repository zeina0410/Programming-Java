package com.mycompany.mavenproject1;
public abstract class Customer extends NameAndPhone {
    public String conname;
    public String email;
   
    public Customer(){
        super(null, null, null, null, null);
        this.conname = null;
        this.email = null;
    }
    
    public Customer(String conname, String email, String fname, String lname, String phone, String username, String password) {
        super(fname, lname, phone, username, password);
        this.conname = conname;
        this.email = email;
    }
 
}
