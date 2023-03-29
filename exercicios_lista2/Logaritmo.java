import java.util.Scanner;

public class Logaritmo {
    public static void main(String[] args) {
        /*12. Ler um numero inteiro. Se o numero lido for negativo, escreva a mensagem “Numero 
        invalido”. Se o numero for positivo, calcular o logaritmo deste numero.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num = scanner.nextInt();

        if(num >= 0){
            double log = Math.log(num);
            System.out.println("O logaritmo do numero " + num + " e " + log);
        }
        else{
            System.out.println("Numero invalido");
        }
        
        scanner.close();

    }
}
