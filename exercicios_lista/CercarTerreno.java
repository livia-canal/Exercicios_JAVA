import java.util.Scanner;

public class CercarTerreno {
    public static void main(String[] args) {
        /*53. Faca um programa para ler as dimensoes de um terreno (comprimento c e largura l),
        bem como o preco do metro de tela p. Imprima o custo para cercar este mesmo terreno
        com tela. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular o custo para cercar o seu terreno! ");
        System.out.println("Digite o comprimento do terreno em metros: ");
        double c = scanner.nextDouble();
        System.out.println("Digite a largura do terreno em metros: ");
        double l = scanner.nextDouble();
        System.out.println("Digite o preco do metro da tela: ");
        double p = scanner.nextDouble();

        double custo = (2 * l + 2 * c) * p;

        System.out.println("O preco para cercer o seu terreno e R$" + custo);

        scanner.close();
    }
}
