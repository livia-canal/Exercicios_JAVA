import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("o número " + num + " é par");
        }
        else{
            System.out.println("o número " + num + " é ímpar");
        }

        scanner.close();
    }
}