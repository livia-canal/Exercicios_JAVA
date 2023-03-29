import java.util.Scanner;

public class Divisivel {
    public static void main(String[] args) {
        /*19. Faca um programa para verificar se um determinado numero inteiro e divisıvel 
        por 3 ou 5, mas nao simultaneamente pelos dois */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if(num % 3 == 0 ){
            System.out.println("É divisível por 3");
        }
        else{
            System.out.println("Não é divisível por 3");
        }
        if(num % 5 == 0){
            System.out.println("É divisível por 5");
        }
        else{
            System.out.println("Não é divisível por 5");
        }

        scanner.close();
    }
}
