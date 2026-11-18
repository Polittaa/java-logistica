import java.util.Scanner;

public class MenuLogistica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Converter Temperatura (Celsius -> Fahrenheit)");
            System.out.println("2 - Converter Distância (Km -> Milhas)");
            System.out.println("3 - Classificar Pedido por Peso");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o temperatura em Celsius: ");
                    double celsius = leitor.nextDouble();
                    double fahrenheit = celsius * 1.8 + 32;
                    System.out.println("Resultado: " + fahrenheit + "°F");
                    break;

                case 2:
                    System.out.print("Digite a distância em Km: ");
                    double km = leitor.nextDouble();
                    double milhas = km * 0.621;
                    System.out.println("Resultado: " + milhas + " milhas");
                    break;

                case 3:
                    System.out.print("Digite o peso do pedido (em kg): ");
                    double peso = leitor.nextDouble();
                    if (peso < 0) {
                        System.out.println("Erro: O peso não pode ser negativo");
                    } else if (peso <= 10) {
                        System.out.println("Prioridade: LEVE");
                    } else if (peso <= 50) {
                        System.out.println("Prioridade: PADRÃO");
                    } else {
                        System.out.println("Prioridade: URGENTE");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 4.");
            }
        } while (opcao != 4);
        leitor.close();
    }
}
