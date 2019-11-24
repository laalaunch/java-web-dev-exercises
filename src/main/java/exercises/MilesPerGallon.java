package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner miles = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        double m = miles.nextDouble();
        Scanner gallons = new Scanner(System.in);
        System.out.println("How many gallons of gas did you use?");
        double g = gallons.nextDouble();

        double mpg = m / g;
        System.out.println("Your miles per gallons is " + mpg);
    }
}
