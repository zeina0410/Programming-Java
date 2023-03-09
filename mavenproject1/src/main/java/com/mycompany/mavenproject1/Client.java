package com.mycompany.mavenproject1;
public class  Client extends Customer {
    public int age;
    public Card ca;
    
    public Client(){
        super(null, null, null, null, null, null, null);
        this.age=0;
        this.ca=null;
    }
    
    public Client(int age, Card ca, String conname, String email, String fname, String lname, String phone, String username, String password) {
        super(conname, email, fname, lname, phone, username, password);
        this.age = age;
        this.ca = ca;
    }
    
}
