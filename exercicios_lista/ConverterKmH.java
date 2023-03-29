import  java.util.Scanner;

public class ConverterKmH {
    public static void main(String[] args) {
        /*10. Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s
        (metros por segundo). A formula de conversao e: M = K/3.6, sendo K a velocidade em
        km/h e M em m/s. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma velocidade em km/h: ");
        double kmH = scanner.nextDouble(); 
        double mS = kmH / 3.6;
        System.out.print("A velocidade " + kmH + "Km/h é " + mS + " em m/s");

        scanner.close();
    }
}
