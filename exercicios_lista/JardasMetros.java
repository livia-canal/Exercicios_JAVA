import java.util.Scanner;

public class JardasMetros{
    public static void main(String[] args) {
        /*22. Leia um valor de comprimento em jardas e apresente-o convertido em metros. A formula de conversao e: 
        M = 0, 91 ∗ J, sendo J o comprimento em jardas e M o comprimento em metros.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um comprimento em jardas");
        double jardas = scanner.nextDouble(); 
        double metros = 0.91 * jardas;
        System.out.println(jardas + " jardas corresponde a " + metros + " metros"); 

        scanner.close();
    }
}