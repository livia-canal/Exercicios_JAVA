import java.util.Scanner;

public class GrausRadianos {
    public static void main(String[] args) {
        
        /*14. Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao e: 
        R = G ∗ π/180, sendo G o angulo em graus e R em radianos e π = 3.14.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ângulo em graus: ");
        double aGraus = scanner.nextDouble();
        double aRadianos = aGraus * 3.14 / 180;
        System.out.print("O ângulo " + aGraus + "° corresponde a " + aRadianos + " rad");

        scanner.close();
    }
}
