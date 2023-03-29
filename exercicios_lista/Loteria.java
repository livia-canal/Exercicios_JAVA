import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        /*52. Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido
        proporcionalmente ao valor que cada deu para a realizacao da aposta. Faca um programa 
        que leia quanto cada apostador investiu, o valor do premio, e imprima quanto cada um
        ganharia do premio com base no valor investido.  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do premio: ");
        double premio = scanner.nextDouble();
        System.out.println("Digite quanto o primeiro apostador investiu: ");
        double a1 = scanner.nextDouble();
        System.out.println("Digite quanto segundo apostador investiu: ");
        double a2 = scanner.nextDouble();
        System.out.println("Digite quanto terceiro apostador investiu: ");
        double a3 = scanner.nextDouble();

        double total = a1 + a2 + a3;
        a1 = a1  / total;
        a2 = a2  / total;
        a3 = a3  / total;

        double r1 = premio * a1;
        double r2 = premio * a2;
        double r3 = premio * a3;

        System.out.println("O primeiro apostador recebe : " + r1 + "\nO segundo apostador recebe : " + r2 + "\nO terceiro apostador recebe: " + r3);        

        scanner.close();

    }
}
