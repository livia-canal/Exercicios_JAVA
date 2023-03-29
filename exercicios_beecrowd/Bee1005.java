import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double A = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double B = scanner.nextDouble();
        double media = (A * 3.5 + B * 7.5) / 11.0;

        System.out.println("MEDIA = " + String.format("%.5f", media));

        scanner.close();
    }
}
