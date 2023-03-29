import java.util.Scanner;

public class M2Acres{
    public static void main(String[] args) {
        /*24. Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A
        formula de conversao e: A = M ∗ 0.000247, sendo M a area em metros quadrados e A a area em acres. 
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma área em metros quadrados: ");
        double m2 = scanner.nextDouble(); 
        double acres = m2 * 0.000247;
        System.out.println(m2 + " metros quadrados corresponde a " + acres + " acres");

        scanner.close();
    }
}