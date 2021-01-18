package com.company;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return this.name;
    }
    public Author[] getAuthor(){
        return this.authors;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        String Authors = new String();
        for(int i = 0; i < this.authors.length; i++){
            Authors += authors[i].toString();
        }
        return "Book[name = " + this.name + "," + Authors +  "price = " + this.price + "qty = " + this.qty + "]";
    }


    public void Test(double price, int qty){
        System.out.println(getName());
        System.out.println(getAuthor());
        System.out.println(getPrice());
        System.out.println(getQty());
        setPrice(price);
        setQty(qty);
    }

    public String getAuthorName(){
        String Authors = new String();
        for(int i = 0; i < this.authors.length; i++){
            Authors += authors[i].getName();
            if(i != this.authors.length - 1) Authors += ",";
        }

        return Authors;
    }
    public String getAuthorEmail(){
        String Authors = new String();
        for(int i = 0; i < this.authors.length; i++){
            Authors += authors[i].getEmail();
            if(i != this.authors.length - 1) Authors += ",";
        }

        return Authors;
    }
    public String getAuthorGender(){
        String Authors = new String();
        for(int i = 0; i < this.authors.length; i++){
            Authors += authors[i].getGender();
            if(i != this.authors.length - 1) Authors += ",";
        }

        return Authors;
    }


    public void test(double price, int qty){
        System.out.println(getName());
        System.out.println(getAuthor());
        System.out.println(getPrice());
        System.out.println(getQty());
        setPrice(price);
        setQty(qty);
        toString();
    }

}
