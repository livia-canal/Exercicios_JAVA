import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        /*51. Escreva um programa que leia as coordenadas x e y de pontos no R2 e calcule sua
        distancia da origem (0, 0). */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular a distancia da origem ate determinado ponto.\nDigite o valor das coordenadas. ");
        System.out.print("X: ");
        double X = scanner.nextDouble();
        System.out.print("Y: ");
        double Y = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));

        System.out.println("A distancia da coordenada (" + X + ", " + Y + ") ate a origem e " + distancia);

        scanner.close();

    }
}
