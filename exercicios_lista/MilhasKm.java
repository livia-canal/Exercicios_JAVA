import  java.util.Scanner;

public class MilhasKm {
    public static void main(String[] args) {
        /*12. Leia uma distancia em milhas e apresente-a convertida em quilometros. A formula de 
        conversao e: K = 1, 61 ∗ M, sendo K a distancia em quilometros e M em milhas.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma distância em milhas: ");
        double dMilhas = scanner.nextDouble(); 
        double dKm = 1.61 * dMilhas;
        System.out.print("A distância " + dMilhas + " milhas corresponde a " + dKm + " Km");

        scanner.close();
    }
}
