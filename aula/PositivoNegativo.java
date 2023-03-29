import java.util.Scanner;

public class PositivoNegativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro, seja ele positivo ou negativo: ");
        int num = scanner.nextInt();
        if (num >= 0){
            System.out.println("o número " + num + " é positivo");
        }
        else{
            System.out.println("o número " + num + " é negativo");
        }

        scanner.close();
    }
}