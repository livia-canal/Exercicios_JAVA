import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        /*2. Leia um numero fornecido pelo usuario. Se esse numero for positivo, calcule a raiz
        quadrada do numero. Se o numero for negativo, mostre uma mensagem dizendo que o numero 
        e invalido. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        if (num >= 0){
            double raizQuadrada = Math.sqrt(num);
            System.out.println("A raiz quadrada do numero e " + String.format("%.1f", raizQuadrada));
        }
        else{
            System.out.print("O numero digitado é invalido!");
        }

        scanner.close();
    }
}
