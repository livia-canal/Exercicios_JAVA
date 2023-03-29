import java.util.Scanner;

public class M2Hectares{
    public static void main(String[] args) {
        /*26. Leia um valor de area em metros quadrados m2 e apresente-o convertido em hectares.
        A formula de conversao e: H = M ∗ 0, 0001, sendo M a area em metros quadrados e H a area em hectares. 
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma área em metros quadrados: ");
        double m2 = scanner.nextDouble(); 
        double hectares = m2 * 0.0001;
        System.out.print(m2 + " metros quadrados corresponde a " + hectares + " hectares");

        scanner.close();
    }
}