import java.util.Scanner;

public class Horario{
    public static void main(String[] args) {
        
        //48. Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em segundos: ");
        int segundos = scanner.nextInt();
        int hora = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.println("O valor digitado corresponde a " + hora + "h " + minutos + "min e " + segundos + "s");

        scanner.close();
    }
}