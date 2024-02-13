package exercises.exercise3;

import java.util.Random;

public class BiggestNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n1 = new Random().nextInt();
        System.out.println("Enter another number: ");
        int n2 = new Random().nextInt();
        if (n1 > n2) {
            System.out.println("First number is biggest");
        } else if (n2 > n1) {
            System.out.println("Second number is biggest");
        } else {
            System.out.println("Both is equals");
        }
    }
}
