package exercises.exercise02;

public class Notas {
    public static void main(String[] args) {
        double nota1 = 6.5;
        double nota2 = 7;
        double media = (nota1 + nota2) / 2;
        String msg = String.format("A média é %f", media);
        System.out.println(msg);
    }
}
