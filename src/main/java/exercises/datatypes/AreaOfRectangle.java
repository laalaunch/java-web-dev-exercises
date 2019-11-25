package exercises.datatypes;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Enter the length");
        double l = length.nextDouble();
        Scanner width = new Scanner(System.in);
        System.out.println("Enter the width");
        double w = width.nextDouble();

        double area = l * w;
        System.out.println("The area of the rectangle is " + area);
    }
}
