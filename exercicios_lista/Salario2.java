import java.util.Scanner;

public class Salario2{
    public static void main(String[] args) {
        /*42. Receba o salario-base de um funcionario. Calcule e imprima o salario a receber, sabendo-se 
        que esse funcionario tem uma gratificacao de 5% sobre o salario-base. Alem disso, ele paga 7% de 
        imposto sobre o salario-base. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário-base do funcionário: ");
        double sBase = scanner.nextDouble();
        double imposto = sBase * 7/100;
        double gratificacao = sBase * 5/100;
        double sLiquido = sBase - imposto - gratificacao;

        System.out.println("O salário líquido a receber é R$" + sLiquido);

        scanner.close();

    }
}