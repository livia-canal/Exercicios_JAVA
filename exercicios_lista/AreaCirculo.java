import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        /*34. Leia o valor do raio de um cırculo e calcule e imprima a area do cırculo correspondente.
        A area do cırculo e π ∗ raio2, considere π = 3.141592. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio de um círculo: ");
        double raio = scanner.nextDouble();
        double area = 3.141592 * Math.pow(raio, 2);

        System.out.println("A area do circulo de raio " + raio + " é " + area);

        scanner.close();
    }
}