package dev.rehm;



public class Circle extends Shape {

    private double radius;

    // by having two constructors with different sets of arguments, we see overloading, an example of polymorphism
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

    // we are overriding the Object class' implementation of the toString method (another example of polymorphism)
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", color=" +getColor() +
                '}';
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
