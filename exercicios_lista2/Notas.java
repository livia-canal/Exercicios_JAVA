import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        /*8. Faca um programa que leia 2 notas de um aluno, verifique se as notas sao validas e 
        exiba na tela a media destas notas. Uma nota valida deve ser, obrigatoriamente, um valor 
        entre 0.0 e 10.0, onde caso a nota nao possua um valor valido, este fato deve ser informado 
        ao usuario e o programa termina. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        if ( n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10){
            double media = (n1 + n2) / 2;
            System.out.print("A média das notas é " + media);
        }
        else{
            System.out.println("Os valores digitados não são válidos!");
        }

        scanner.close();
    }
}
