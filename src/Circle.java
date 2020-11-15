import java.lang.Math;
import java.util.Scanner;

public class Circle {

    private double pi = Math.PI;
    private double radius;
    private double perimeter;
    private double area;

    public Circle(final double radius){
        this.radius = radius;
        this.computePerimeter();
        this.computeArea();
    }

    private void computePerimeter(){
       this.perimeter= 2*pi*this.radius;
    }

    private void computeArea(){
        this.area=pi * Math.pow(this.radius, 2);
    }

    public double getRadius() {
       return this.radius;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
       return this.perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
