import java.util.Scanner;

public class AnoBissexto{
    public static void main(String[]args){
        /*23. Determine se um determinado ano lido e bissexto. Sendo que um ano e bissexto se
        for divisıvel por 400 ou se for divisıvel por 4 e nao for divisıvel por 100. Por exemplo:
        1988, 1992, 1996 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano para verificar se é bissexto ou não: ");
        int ano = scanner.nextInt();

        if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
            System.out.println("O ano " + ano + " é bissexto.");
        }
        else{
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();

    }
}