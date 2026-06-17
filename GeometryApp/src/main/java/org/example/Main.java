package org.example;

import org.utils.Converter;
import org.threeD.Cube;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double cm = 250;
        double m = Converter.cmToMeters(cm);
        double km = Converter.mToKilometers(m);

        System.out.println("Meters: " + m);
        System.out.println("Kilometers: " + km);

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        Cube cube = new Cube(3);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Cube volume: " + cube.getVolume());
    }

}
