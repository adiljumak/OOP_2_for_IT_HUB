package com.company;

public class Author {
    private String name;
    private String email;
    private char gender = 'f';

    public Author(String name , String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return gender;
    }

    public String toString(){
        return "Author[name = " + this.name +", email = " + this.email + ", gender = " + gender + ']';
    }

    public void Test(String email){
        System.out.println(toString());
        setEmail(email);
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getGender());
    }
}
