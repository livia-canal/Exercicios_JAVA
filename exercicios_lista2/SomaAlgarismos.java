import java.util.Scanner;

public class SomaAlgarismos {
    public static void main(String[] args) {
        /*11. Escreva um programa que leia um numero inteiro maior do que zero e devolva, na tela, a
        soma de todos os seus algarismos. Por exemplo, ao numero 251 corresponder a o valor 8 (2 + 5 + 1).
        Se o numero lido nao for maior do que zero, o programa terminara com a mensagem “Numero invalido”.*/
        int d, n, soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = scanner.nextInt();

        if (n > 0){
            while(n != 0){
                d = n % 10;
                n = n / 10;
                soma = soma + d;
            }
            System.out.print("A soma dos algarismos do numero e " + soma);
        }        
        else{
            System.out.println("Numero invalido");
        }

        scanner.close();
    }
}
