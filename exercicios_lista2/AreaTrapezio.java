import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        /*17. Faca um programa que calcule e mostre a area de um trapezio. 
        Lembre-se a base maior e a base menor devem ser numeros maiores que zero.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a area de um trapzio! \nDigite o valor da base maior: ");
        double bMaior = scanner.nextDouble();
        System.out.println("Digite o valor da base menor: "); 
        double bMenor = scanner.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        if(bMaior > 0 && bMenor > 0 && altura > 0){
            double area = (bMaior + bMenor) * altura / 2;
            System.out.println("A area do trapezio e " + area);
        }
        else{
            System.out.println("Valores invalidos");
        }

        scanner.close();

    }
}
