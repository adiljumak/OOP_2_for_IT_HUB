package com.company;

public class Cylinder extends MyCircle{
    private double height;
    public Cylinder(){
        super();
        height = 1.0;
    }


    @Override
    public double getArea(){
        return 2 * Math.PI * radius * radius + 2*Math.PI*radius*height;
    }


    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(int radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
