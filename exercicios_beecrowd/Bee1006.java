import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double A = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double B = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double C = scanner.nextDouble();
        double media = (A * 2 + B * 3 + C * 5) / 10.0;

        System.out.println("MEDIA = " + String.format("%.1f", media));

        scanner.close();
    }
}
