/*
 Como usei a IA neste código:
 Usei a IA pra me tirar dúvidas de sintaxe do Java, entender como montar
 os laços de repetição  e me destravar nos erros do IntelliJ.
 Fui acompanhando e testando cada parte pra pegar a lógica e aprender na prática.
 */

import java.util.Scanner;

public class MenuLogisticaFinal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Converter Temperatura (Celsius -> Fahrenheit)");
            System.out.println("2 - Converter Distância (Km -> Milhas)");
            System.out.println("3 - Classificar Pedidos por Peso (com Contadores)");
            System.out.println("4 - Sobre o Sistema (Versão e Portabilidade)");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = leitor.nextDouble();
                    double fahrenheit = celsius * 1.8 + 32;
                    System.out.println("Resultado: " + fahrenheit + " °F");
                    break;

                case 2:
                    System.out.print("Digite a distância em Km: ");
                    double km = leitor.nextDouble();
                    double milhas = km * 0.621;
                    System.out.println("Resultado: " + milhas + " milhas");
                    break;

                case 3:
                    int qtdLeve = 0;
                    int qtdPadrao = 0;
                    int qtdUrgente = 0;
                    double peso = 0;

                    while (peso != -1) {
                        System.out.print("Digite o peso (ou -1 para voltar ao menu): ");
                        peso = leitor.nextDouble();

                        if (peso == -1) {
                            System.out.println("Encerrando a triagem de pedidos...");
                        } else if (peso < 0) {
                            System.out.println("Erro: O peso não pode ser negativo");
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
                    break;

                case 4:
                    String versaoJava = System.getProperty("java.version");
                    System.out.println("Versão do Java em uso: " + versaoJava);
                    System.out.println("\nPor que este programa roda em qualquer sistema?");
                    System.out.println("Porque o Java compila o código para bytecode, que roda dentro da JVM (Máquina Virtual Java).");
                    System.out.println("Como a JVM serve como intermediária, o mesmo arquivo roda igual no Windows, Linux ou Mac.");
                    break;

                case 5:
                    System.out.println("Saindo do sistema..");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha um número de 1 a 5.");
            }

        } while (opcao != 5);

        leitor.close();
    }
}