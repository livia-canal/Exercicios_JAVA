import java.util.Scanner;

public class PolegadaCentimetros {
    public static void main(String[] args) {
        
        /*16. Leia um valor de comprimento em polegadas e apresente-o convertido em centımetros.
        A formula de conversao e: C = P ∗ 2, 54, sendo C o comprimento em centimetros e P o
        comprimento em polegadas.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um comprimento em polegadas: ");
        double vPolegadas = scanner.nextDouble();
        double vCm = vPolegadas * 2.54;
        System.out.print("O comprimento " + vPolegadas + " in corresponde a " + vCm + " cm");

        scanner.close();
    }
}
