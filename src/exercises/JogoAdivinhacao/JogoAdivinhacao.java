package exercises.JogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Escolha um número entre 1 e 100: ");
            int numeroEscolhido = leitura.nextInt();
            tentativas++;
            if (numeroEscolhido == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + "tentativas");
                break;
            } else if (numeroEscolhido < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
            if (tentativas == 5) {
                System.out.println("Você não conseguiu acertar em cinco tentativas. O número é " + numeroGerado);
            }
        }
    }
}
