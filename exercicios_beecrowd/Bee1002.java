import java.util.Scanner; 

public class Bee1002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double R = scanner.nextDouble();
        double A = 3.14159 * R * R;
        System.out.println("A=" + String.format("%.4f", A)); 

        scanner.close();
    }
}
