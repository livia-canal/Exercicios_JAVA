import java.util.Scanner;

public class KelvinCelsius {
    
    public static void main(String[] args) {
        
        /*8. Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
        formula de conversao e: C = K − 273.15, sendo C a temperatura em Celsius e K a
        temperatura em Kelvin. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma temperatura em graus Kelvin: ");
        double K = scanner.nextDouble();
        double C = K - 273.15;
        System.out.print( String.format("%.1f", K) + " K corresponde a " + String.format("%.2f", C) + " °C");

        scanner.close();
    }
}
