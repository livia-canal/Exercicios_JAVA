import java.util.Scanner;

public class QuadradoNumero {

    public static void main(String[] args) {
        
       //4. Leia um numero real e imprima o resultado do quadrado desse numero.
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um número real:");
       double num = scanner.nextDouble();
       double quadradoDoNum = (num)*(num);
       System.out.print("O quadrado do número " + num + " é " + quadradoDoNum); 

       scanner.close();
    }
}