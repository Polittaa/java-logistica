public class ConversorUnidades {

    public static void main(String[] args) {

        double celsius = 30.5;
        double fahrenheit = celsius * 1.8 + 32;

        int quilometros = 10;
        double milhas = quilometros * 0.621;

        double referencia = 85.0;

        if (fahrenheit > referencia) {
            System.out.println("A temperatura é maior que a referência");
        } else if (fahrenheit < referencia) {
            System.out.println("A temperatura é menor que a referência");
        } else {
            System.out.println("A temperatura é igual à referência");
        }
    }
}
