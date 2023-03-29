import java.util.Scanner;

public class VolumeCilindro{
    public static void main(String[] args) {

        /*36. Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume
        de um cilindro circular e calculado por meio da seguinte formula: V = π ∗ raio2 ∗ altura,
        onde π = 3.141592.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura de um cilindro circular: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o raio desse mesmo cilindro: ");
        double raio = scanner.nextDouble();

        double volume = 3.141592 * Math.pow(raio, 2) * altura; 
        
        System.out.println("O volume do cilindro circular é " + String.format("%.2f", volume));

        scanner.close();
    }
}