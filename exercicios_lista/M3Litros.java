import java.util.Scanner;

public class M3Litros{

    public static void main(String[] args) {
        /*18. Leia um valor de volume em metros cubicos m3 e apresente-o convertido em litros. A
        formula de conversao e: L = 1000 ∗ M, sendo L o volume em litros e M o volume em metros cubicos*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um volume em metros cúbicos: ");
        double M3 = scanner.nextDouble(); 
        double L = M3 * 1000; 
        System.out.print(M3 + " metros cúbicos corresponde a " + L + " litros");

        scanner.close();
    }
}