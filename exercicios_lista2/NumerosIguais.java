import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        /*7. Faca um programa que receba dois numeros e mostre o maior. Se por acaso, os dois 
        numeros forem iguais, imprima a mensagem Numeros iguais.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois numeros: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        if (n1 > n2){
            System.out.print("O maior numero e " + n1);
        }
        else if (n2 > n1){
            System.out.print("O maior numero e " + n2);
        }
        else{
            System.out.print("Numeros iguais!");
        }

        scanner.close();

    }
}
