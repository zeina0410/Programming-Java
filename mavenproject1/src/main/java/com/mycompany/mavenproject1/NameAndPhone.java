package com.mycompany.mavenproject1;
public class NameAndPhone {
    public String fname;
    public String lname;
    public String phone;
    public String username;
    public String password;

    public NameAndPhone(){
        this.fname = null;
        this.lname = null;
        this.phone = null;
        this.username = null;
        this.password = null;
    }
    
    public NameAndPhone(String fname, String lname, String phone, String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

}
