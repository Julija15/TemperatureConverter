import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite temperaturu");
        double temperature = scanner.nextInt();
        System.out.println("C t = " +
                new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("K t = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("F 9t = " +
                new FahrenheitConverter().getConvertedValue(temperature));
    }
}