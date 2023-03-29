import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        //1. Faca um programa que receba dois numeros e mostre qual deles e o maior. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if ( num1 >= num2){
            System.out.println("O maior numero e " + num1);
        }
        else{
            System.out.println("O maior numero e " + num2);
        }

        scanner.close();
    }
}