package exercises.exercise3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite um número para fazer a tabuada: ");
        int number = reading.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
