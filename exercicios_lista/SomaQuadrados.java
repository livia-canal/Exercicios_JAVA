import java.util.Scanner;

public class SomaQuadrados{
    public static void main(String[] args) {
        
        //28. Faça a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, somaQuadrados;

        System.out.print("Digite o primeiro valor: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        n3 = scanner.nextDouble();

        somaQuadrados = Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2);

        System.out.print("A soma dos quadrados dos três valores é " + somaQuadrados);

        scanner.close();
    }
}