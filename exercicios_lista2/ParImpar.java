import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //5. Faca um programa que receba um numero inteiro e verifique se este numero e par ou ımpar.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();

        if(n % 2 == 0) {
            System.out.print("O numero " + n + " e par");
        }
        else{
            System.out.print("O numero " + n + " e impar");
        }

        scanner.close();
    }
}
