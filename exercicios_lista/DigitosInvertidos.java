import java.util.Scanner;

public class DigitosInvertidos{
    public static void main(String[] args) {
        /*46. Faca um programa que leia um numero inteiro positivo de tres dıgitos (de 100 a 999).
        Gere outro numero formado pelos dıgitos invertidos do numero lido.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro de três dígitos (de 100 a 999): ");
        int num = scanner.nextInt();
        int d1 = num % 10;
        num = num / 10;
        int d2 = num % 10;
        int d3 = num / 10;
        System.out.println("" + d1 + d2 + d3);

        scanner.close();
    }
}