package dev.rehm;

public class Driver {

    public static void main(String[] args) {
        Circle c = new Circle("blue",4);
        System.out.println(c.getColor());
        c.setColor("green");
        System.out.println(c.getColor());

        c.setRadius(-20);
//        c.radius = -20;
        System.out.println(c.getRadius());
        System.out.println(c);

        Circle c1 = new Circle();
//        Circle c2 = new Circle("blue", 8, 9);

        // another example of polymorphism is the ability to refer to a subclass as an instance of its superclass or
        // implemented interface
        Shape s = new Circle();
        Calculable cal = new Circle();
    }
}
