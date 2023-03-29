import java.util.Scanner;

public class Salario{

    public static void main(String[] args) {
        
        /*38. Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que
        ele recebeu um aumento de 25%.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu sálario mensal: ");
        double salario = scanner.nextDouble();
        salario = salario * 1.25;
        System.out.println("O valor do salário com o aumento de 25% é R$" + salario);

        scanner.close();
    }
}