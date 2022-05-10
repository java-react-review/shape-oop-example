package dev.rehm;

public abstract class Shape implements Calculable {

    private String color;

    Shape(){
    }

    Shape(String colorParam){
        this.color = colorParam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

}
