import java.util.Scanner;

public class ImprimirNumReal {

    public static void main(String[] args) {

       //2. Faça um programa que leia um numero real e o imprima.
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um número real:");
       double num = scanner.nextDouble();
       System.out.print("O número real é " + num);

       scanner.close();
    }
    
}
