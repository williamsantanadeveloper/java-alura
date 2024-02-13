package exercises.exercise3;

import java.util.Scanner;

public class CalculingAreas {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter value of side: ");
        double sideSquare = reading.nextDouble();
        double areaSquare = Math.pow(sideSquare, 2);
        System.out.println("The area of square is " + areaSquare);

        System.out.println("Enter ray of circle: ");
        double ray = reading.nextDouble();
        double areaCircle = Math.round(Math.pow(ray, 2) * Math.PI);
        System.out.println("The area of circle is " + areaCircle);
    }
}
