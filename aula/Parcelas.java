import java.util.Scanner;

public class Parcelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra (R$): ");
        double valor = scanner.nextDouble();
        System.out.println("Agora, escola o número de parcelas: ");
        System.out.println("> 1 (a vista) -> 10% de desconto;");
        System.out.println("> 2 parcelas -> preço normal;");
        System.out.println("> 3 parcelas -> 10% de acréscimo;");
        int parcela = scanner.nextInt();

        if (parcela == 1){
            double desconto = valor * 0.10;
            valor = valor - desconto;
            System.out.println("O valor a vista com 10% desconto é R$" + valor);
        }
        else if(parcela == 2){
            double p2 = valor / 2;
            System.out.println("O valor R$" + valor + " divido em duas parcelas é R$" + p2);
        }
        else if (parcela == 3){
            valor = valor * 1.10;
            double p3 = valor / 3;
            System.out.println("O valor " + valor + " divido em três parcelas é R$" + p3);
        }
        else{
            System.out.println("ERRO");
            System.out.println("Número de parcelas inválido!");
        }


        scanner.close();
    }
}
