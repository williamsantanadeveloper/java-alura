package exercises.exercise02;

public class PrecoProduto {
    public static void main(String[] args) {
        double price = 29.99;
        int amount = 5;
        double totalPrice = (price * amount);

        String mensagem = String.format("O preço total é: %f", totalPrice);
        System.out.println(mensagem);
    }

}
