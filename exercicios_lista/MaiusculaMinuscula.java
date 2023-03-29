import java.util.Scanner;

public class MaiusculaMinuscula{
    public static void main(String[] args) {
        /*45. Faca um programa para converter uma letra maiuscula em letra minuscula. Use a tabela
        ASCII para resolver o problema.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra em maiúsculo: ");
        char maiuscula = scanner.next().charAt(0);
        char minuscula = Character.toLowerCase(maiuscula);
        System.out.println("Letra maiúscula: " + maiuscula + "\nLetra minúscula: " + minuscula);

        scanner.close();
    }
}