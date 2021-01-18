package com.company;

public class MyPoint {
    private int x = 0;
    private int y = 0;
    public MyPoint(){x=0;y=0;};
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public int[] getXY(){
        int[] a = new int[2];
        a[0] = x;
        a[1] = y;
        return a;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distance(MyPoint p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

}
