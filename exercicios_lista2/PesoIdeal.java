import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        /*10. Faca um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
        peso ideal, utilizando as seguintes formulas (onde h corresponde a altura): 
        • Homens: (72.7 ∗ h) − 58
        • Mulheres: (62, 1 ∗ h) − 44, 7 */
        double pesoIdeal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULE SEU PESO IDEAL");

        System.out.println("Digite seu sexo (F para feminino e M para Masculino): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite sua altura: ");
        double h = scanner.nextDouble();

        if(sexo == 'm' || sexo == 'M'){ 
            pesoIdeal = h * 72.7 - 58;
        }
        else {
            pesoIdeal = h * 62.1 - 44.7;
        }

        System.out.println("Seu peso ideal é " + String.format("%.2f", pesoIdeal));

        scanner.close();
    }
}
