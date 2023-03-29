import java.util.Scanner;

public class Escada{
    public static void main(String[] args) {
        /*44. Receba a altura do degrau de uma escada e a altura que o usuario deseja alcancar
        subindo a escada. Calcule e mostre quantos degraus o usuario devera subir para atingir 
        seu objetivo. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do degrau: ");
        double alturaDegrau = scanner.nextDouble(); 
        System.out.println("Digite a altura que deseja alcançar: ");
        double alturaTotal = scanner.nextDouble();
        double degraus = alturaTotal / alturaDegrau ;

        System.out.println("Você deverá subir " + (int)degraus + " degraus para alcançar seu objetivo!");

        scanner.close();
    }
}