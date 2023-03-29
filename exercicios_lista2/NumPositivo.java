import java.util.Scanner;

public class NumPositivo {
    public static void main(String[] args) {
        /*4. Faca um programa que leia um numero e, caso ele seja positivo, calcule e mostre: 
            • O numero digitado ao quadrado 
            • A raiz quadrada do numero digitado */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero positivo: ");
        double n = scanner.nextDouble();

        if (n >= 0){
            double quadradoNum = Math.pow(n, 2);
            double raizNum = Math.sqrt(n);
            System.out.println("Numero: " + n + "\nQuadrado do Numero: " + quadradoNum + 
            "\nRaiz Quadrada do Numero: " + raizNum);
        }
        else{
            System.out.println("O numero digitado e invalido.");
        }

        scanner.close();

    }
}
