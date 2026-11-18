import java.util.Scanner;

public class ClassificadorPedidoLoop {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdLeve = 0;
        int qtdPadrao = 0;
        int qtdUrgente = 0;

        double peso = 0;

        while (peso != -1) {
            System.out.print("Digite o peso do pedido (ou -1 para sair): ");
            peso = leitor.nextDouble();

            if (peso == -1) {
                System.out.println("Encerrando o sistema...");
            } else if (peso < 0) {
                System.out.println("Erro: O peso digitado não pode ser negativo.");
            } else if (peso <= 10) {
                System.out.println("Prioridade: LEVE");
                qtdLeve++;
            } else if (peso <= 50) {
                System.out.println("Prioridade: PADRÃO");
                qtdPadrao++;
            } else {
                System.out.println("Prioridade: URGENTE");
                qtdUrgente++;
            }
        }

        System.out.println("Pedidos Leves: " + qtdLeve);
        System.out.println("Pedidos Padrão: " + qtdPadrao);
        System.out.println("Pedidos Urgentes: " + qtdUrgente);

        leitor.close();
    }
}