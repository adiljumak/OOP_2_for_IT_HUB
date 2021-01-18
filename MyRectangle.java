package com.company;

public class MyRectangle{

    private MyPoint v1;
    private MyPoint v2;
    public MyRectangle(int x1, int y1, int x2, int y2){
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);

    }
    public MyRectangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;

    }

    public double getProjectionX(){
        return v2.getX() - v1.getY();
    }
    public double getProjectionY(){
        return v1.getY() - v2.getY();
    }

    public double getPerimeter(){
        return 2*(Math.abs(getProjectionX()) + Math.abs(getProjectionY()));
    }
    public double getArea(){
        return Math.abs(getProjectionX())*Math.abs(getProjectionY());
    }


    public String toString(){
        return "MyTriangle[v1="+ "("+v1.getX()+","+v1.getY()+")" +",v2="   +  "("+v2.getX()+","+v2.getY()+")";
    }


    public void Test(){
        toString();
        getArea();
        getPerimeter();
        getProjectionX();
        getProjectionY();
    }


}
