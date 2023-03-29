import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = scanner.nextInt();
        int prod = num1 * num2;

        System.out.println("PROD = " + prod);

        scanner.close();

    }
}
