package com.company;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        radius=1.0;
    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString()
    {
        return super.toString()+ "Circle :radius= "+radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public  double getPrimeter()
    {
        return Math.PI*radius*2;
    }
}
