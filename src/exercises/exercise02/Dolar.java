package exercises.exercise02;

public class Dolar {
    public static void main(String[] args) {
        double valorEmDolares = 200;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println(Math.round(valorEmReais));
    }
}
