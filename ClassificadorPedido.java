import java.util.Scanner;

public class ClassificadorPedido {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso do pedido");
        double peso = leitor.nextDouble();

        if (peso < 0) {
            System.out.println("O peso digitado  não pode ser negativo");
        }
        /*
        Até 10 kg (Leve): Cargas pequenas para transporte rápido (motoboy)
        De 10.01 a 50 kg (Padrão): Cargas intermediárias para vans
        Acima de 50 kg (Urgente): Cargas pesadas que exigem um  caminhão.
         */
        else if (peso <= 10) {
            System.out.println("Prioridade: LEVE");
        } else if (peso <= 50) {
            System.out.println("Prioridade: PADRÃO");
        } else {
            System.out.println("Prioridade: URGENTE");
        }
        leitor.close();
    }
}
