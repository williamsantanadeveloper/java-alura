package exercises.exercise3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Informe um numero para calcular o fatorial: ");
        int number = reading.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= number; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + number + " é: " + fatorial);
    }
}
