import java.util.Scanner;

public class temperatura   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_TEMPERATURAS = 12;
        double somaTemperaturas = 0;
        int temperaturasValidas = 0;

        System.out.println("Medição de Temperatura");

        for (int i = 1; i <= NUM_TEMPERATURAS; i++) {
            double temperatura;
            do {
                System.out.print("Digite a temperatura " + i + " (entre 4°C e 10°C): ");
                temperatura = scanner.nextDouble();
            } while (temperatura < 4 || temperatura > 10);

            somaTemperaturas += temperatura;
            temperaturasValidas++;
        }

        double media = somaTemperaturas / temperaturasValidas;
        System.out.println("A média das temperaturas é: " + media + "°C");

        scanner.close();
    }
}
