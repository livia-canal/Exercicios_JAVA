import java.util.Scanner;

public class CotacaoDolar{
    public static void main(String[] args) {
       //30. Leia um valor em real e a cotacao do dolar. Em seguida, imprima o valor correspondente em dolares.
       double vReal, cotacao, vDolar;

       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um valor em real (R$): ");
       vReal = scanner.nextDouble();
       System.out.print("Digite a cotação em dólar: ");
       cotacao = scanner.nextDouble(); 

       vDolar = vReal / cotacao;

       System.out.print("O valor corresponde em dólar é " + vDolar);

       scanner.close();
    }
}