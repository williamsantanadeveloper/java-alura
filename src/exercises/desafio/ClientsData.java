package exercises.desafio;
import java.util.Scanner;
public class ClientsData {
    public static void main(String[] args) {
        System.out.println("***********************");

        System.out.println("Dados iniciais do cliente: ");
        Scanner reading = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = reading.nextLine();
        System.out.print("Tipo de conta: ");
        String typeAccount = reading.nextLine();
        System.out.print("Saldo inicial: ");
        double openingBalance = reading.nextDouble();
        String menssageClientsData = String.format(
                "Nome: %s \n" +
                        "Tipo de conta: %s \n"
                        + "Saldo inicial: %f", name, typeAccount, openingBalance);
        System.out.println("***********************");
        System.out.println(menssageClientsData);

        System.out.println("\nOperações");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");

        System.out.println("Digite a opção desejada: ");
        int option = reading.nextInt();

        switch (option) {

            case 1:
                System.out.println("Saldo atual: " + openingBalance);
                break;
            case 2:
                System.out.print("Informe o valor que vai receber: ");
                double receiveValue = reading.nextDouble();
                double currentBalance = receiveValue + openingBalance;
                System.out.println("Saldo atualizado R$ " + currentBalance);
                break;
            case 3:
                double removingValue = reading.nextDouble();
                currentBalance = openingBalance - removingValue;
                if (removingValue > openingBalance) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }
                System.out.println("Saldo atualizado R$ " + currentBalance);
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
