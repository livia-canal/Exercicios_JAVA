import java.util.Scanner;

public class MaiorEDiferenca {
    public static void main(String[] args) {
        /*6. Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles, 
        assim como a diferenca existente entre ambos. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois numeros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 >= n2){
            int diferenca = n1 - n2;
            System.out.println("O maior numero é " + n1 + 
            "\nA diferenca entre " + n1 + " e " + n2 + " é " + diferenca);
        }
        else{
            int diferenca = n2 - n1;
            System.out.println("O maior numero é " + n2 + 
            "\nA diferenca entre " + n1 + " e " + n2 + " é " + diferenca);
        }

        scanner.close();
        
    }
}
