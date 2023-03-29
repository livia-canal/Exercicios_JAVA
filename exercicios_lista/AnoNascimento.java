import java.util.Scanner;

public class AnoNascimento {
    public static void main(String[] args) {
        /*50. Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de
        sua idade e do ano atual.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int ano = scanner.nextInt();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int nascimento = ano - idade;

        System.out.println("Seu ano de nascimento e " + nascimento);

        scanner.close();
    }
}
