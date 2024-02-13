package exercises.exercise3;

import java.util.Random;

public class ParOuImpar {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        if (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
