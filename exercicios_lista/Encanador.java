import java.util.Scanner;

public class Encanador{
    public static void main(String[] args) {
        /*40. Uma empresa contrata um encanador a R$ 30,00 por dia. Faca um programa que solicite
        o numero de dias trabalhados pelo encanador e imprima a quantia lıquida que devera ser paga, 
        sabendo-se que sao descontados 8% para imposto de renda.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de dias trabalhados pelo encanador: ");
        int dias = scanner.nextInt();

        double sBruto = 30.0 * dias;
        double ir = sBruto * 0.08;
        double sLiquido = sBruto - ir;
        
        System.out.println("O salário líquido a ser pago para o encanador é de R$" + sLiquido);

        scanner.close();
    }
}