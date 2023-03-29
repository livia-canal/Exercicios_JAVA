import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        double v1, v2, v3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três valores: ");
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
        v3 = scanner.nextInt();

        if(v1 >= v2 && v1 >= v3){
            System.out.println("O maior número é " + v1);
        }
        else if (v2 >= v3){
            System.out.println("O maior número é " + v2);
        }
        else{
            System.out.println("O maior número é " + v3);
        }

        scanner.close();
    }
}
