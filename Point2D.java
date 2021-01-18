package com.company;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }


    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float a[] = new float[2];
        a[0] = x;
        a[1] = y;
        return a;

    }

    public String toString(){
        return  "(" + x + "," + y + ")";
    }

}
