package com.company;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        setRadius(radius);
    }
     public ComparableCircle(String color,boolean filled,double radius)
     {
         super(color,filled,radius);
     }

    public int compareTo(Object o){
        ComparableCircle comparableCircle = (ComparableCircle) o;
        if(getRadius()> comparableCircle.getRadius()) {
            return 1;
        }
        else if(getRadius()< comparableCircle.getRadius()){
            return -1;
        }
        else
            return 1;

    }
}
