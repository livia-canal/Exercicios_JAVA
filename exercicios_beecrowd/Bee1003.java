import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}
