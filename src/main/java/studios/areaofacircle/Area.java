package studios.areaofacircle;

import java.util.Scanner;

import static studios.areaofacircle.Circle.*;

public class Area {
    public static void main(String[] args) {

        Scanner radius = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r = radius.nextDouble();

        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
