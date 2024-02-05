package exercises.exercise02;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 50;
        double porcentagemDoDesconto = 0.20;

        double valorComDesconto = (precoOriginal * porcentagemDoDesconto);
        double novoPreco = precoOriginal - valorComDesconto;
        System.out.println(novoPreco);

    }
}
