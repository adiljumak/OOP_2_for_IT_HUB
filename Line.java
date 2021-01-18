package com.company;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY){
        this.begin = new Point(beginX,beginY);
        this.end = new Point(endX,endY);
    }

    public Point getBegin(){
        return begin;
    }
    public Point getEnd(){
        return end;
    }
    public void setBegin(Point begin){
        this.begin = begin;
    }

    public void setEnd(Point end){
        this.end = end;
    }
    public float getBeginX(){
        return begin.getX();
    }
    public float getBeginY(){
        return begin.getY();
    }
    public float getEndX(){
        return end.getX();
    }
    public float getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }

    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }
    public float getLength(){
        return (float) Math.sqrt((getBeginY()-getEndY()*getBeginY()-getEndY())+(getBeginX()-getEndX()*getBeginX()-getEndX()));
    }
    public double getGradient(){
        return Math.atan2(getBeginY()-getEndY(),getBeginX()-getEndX());
    }
}
