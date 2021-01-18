package com.company;

public class MyCircle {
    private MyPoint center  = new MyPoint(0, 0);
   protected int radius = 1;

    public MyCircle(){
        center = new MyPoint(0,0);
        this.radius = radius;
    }
    public MyCircle(int radius){
        this.radius = radius;
    }
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public int getRadius(){return radius;}

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return center;
    }

    public void setCenter(MyPoint center){
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }


    public int[] getCenterXY(){
        int[] c = new int[2];
        c[0] = center.getX();
        c[1] = getCenterY();
        return c;
    }

    public void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }


    public String toString(){
        return "My circle[ radius = " + radius+ ", center = " + center.toString();
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double geCircumference(){
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle c) {
        return center.distance(c.center);
    }
}
