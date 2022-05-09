package dev.rehm;



public class Circle extends Shape {

    private double radius;

    public Circle(){
        super();
    }

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        if(radius>0){
            this.radius = radius;
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double findPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double findArea() {
        return radius*radius*Math.PI;
    }
}
