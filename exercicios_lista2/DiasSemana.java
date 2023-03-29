import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        /*15. Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da 
        semana correspondente a este numero. Isto e, domingo se 1, segunda-feira se 2, e assim por diante.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro entre 1 e 7: ");
        int n = scanner.nextInt();

        switch(n){
            case 1:
                System.out.print("O numero 1 corresponde a Domingo");
            break;
            case 2:
                System.out.print("O numero 2 corresponde a Segunda-feira");
            break;
            case 3:
                System.out.print("O numero 3 corresponde a Terça-feira");
            break;
            case 4:
                System.out.print("O numero 4 corresponde a Quarta-feira");
            break;
            case 5:
                System.out.print("O numero 5 corresponde a Quinta-feira");
            break;
            case 6:
                System.out.print("O numero 6 corresponde a Sexta-feira");
            break;
            case 7:
                System.out.print("O numero 7 corresponde a Sabado");
            break;
            default:
                System.out.print("Numero invalido");
            break;
        }

        scanner.close();
    }
}
