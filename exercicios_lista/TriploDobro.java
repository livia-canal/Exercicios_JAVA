import java.util.Scanner;

public class TriploDobro{
    public static void main(String[] args) {
        
        /*32. Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de
        seu dobro.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: "); 
        int num = scanner.nextInt();

        int sucessorTriplo = num * 3 + 1;
        int antecessorDobro = num * 2 - 1 ;  
        int soma = sucessorTriplo + antecessorDobro;

        System.out.println("Sucessor de seu triplo: " + sucessorTriplo + 
        "\n" + "Antecessor de seu dobro: " +  antecessorDobro + "\n" + "Soma: " + soma);

        scanner.close();
    }
}