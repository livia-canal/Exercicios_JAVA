import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        /*16. Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mes
        correspondente a este numero. Isto e, janeiro se 1, fevereiro se 2, e assim por diante.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro entre 1 e 12: ");
        int n = scanner.nextInt();

        switch(n){
            case 1:
                System.out.print("JANEIRO");
            break;
            case 2:
                System.out.print("FEVEREIRO");
            break;
            case 3:
                System.out.print("MARÇO");
            break;
            case 4:
                System.out.print("ABRIL");
            break;
            case 5:
                System.out.print("MAIO");
            break;
            case 6:
                System.out.print("JUNHO");
            break;
            case 7:
                System.out.print("JULHO");
            break;
            case 8:
                System.out.print("AGOSTO");
            break;
            case 9:
                System.out.print("SETEMBRO");
            break;
            case 10:
                System.out.print("OUTUBRO");
            break;
            case 11:
                System.out.print("NOVEMBRO");
            break;
            case 12:
                System.out.print("DEZEMBRO");
            break;
            default:
                System.out.print("Numero invalido");
            break;
        }

        scanner.close();
    }
}
