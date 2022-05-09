package dev.rehm;


public class Rectangle extends Shape{

    public static final int SIDES = 4;
    private double height;
    private double width;

    public Rectangle(){
    }

    Rectangle(String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        if(width>0) {
            this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        if(width>0){
            this.width = width;
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double findPerimeter() {
        return (height+width)*2;
    }

    @Override
    public double findArea() {
        return height*width;
    }
}
