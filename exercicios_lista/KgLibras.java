import java.util.Scanner;

public class KgLibras{
    public static void main(String[] args) {

        /*20. Leia um valor de massa em quilogramas e apresente-o convertido em libras. A formula de conversao e:
        L = K / 0,45 , sendo K a massa em quilogramas e L a massa em libras.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite um valor em quilogramas: ");
        double kg = scanner.nextDouble(); 
        double lb = kg / 0.45;
        System.out.print (kg + "Kg corresponde a " + lb + "lb"); 

        scanner.close();
    }
}