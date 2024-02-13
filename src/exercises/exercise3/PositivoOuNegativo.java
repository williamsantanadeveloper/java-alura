package exercises.exercise3;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = reading.nextInt();

        if (number > 0) {
            System.out.println("O número é positivo");
        } else if (number < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }
    }
}
