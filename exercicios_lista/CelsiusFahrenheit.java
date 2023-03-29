import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        
        /*6. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
        A formula de conversao e: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit
        e C a temperatura em Celsius.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma temperatura em graus Celsius: ");
        double C = scanner.nextDouble();
        double F = C * 9/5 + 32;
        System.out.print(C + " °C corresponde a " + F + " °F");

       scanner.close();

    }
    
}
