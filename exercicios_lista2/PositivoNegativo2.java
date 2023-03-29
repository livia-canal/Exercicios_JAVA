import java.util.Scanner;

public class PositivoNegativo2 {
    public static void main(String[] args) {
        /*3. Leia um numero real. Se o numero for positivo imprima a raiz quadrada. Do contrario,
        imprima o numero ao quadrado.*/
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um numero real: ");
        double n = scanner.nextDouble();

        if ( n >= 0){
            double raizQuadrada = Math.sqrt(n);
            System.out.println("A raiz quadrada do numero e " + String.format("%.1f", raizQuadrada));
        } 
        else{
            double quadrado = Math.pow(n, 2);
            System.out.println("O quadrado do numero e " + quadrado);
        }

        scanner.close();
    }
}
