import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        /*18. Faca um programa que mostre ao usuario um menu com 4 opcoes de operacoes matematicas 
        (as basicas, por exemplo). O usuario escolhe uma das opcoes e o seu programa entao pede 
        dois valores numericos e realiza a operacao, mostrando o resultado e saindo. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("MENU DE OPERAÇÕES BÁSICAS \n1. Adição \n2. Subtração \n3. Multiplicação \n4. Divisão \nEscolha uma das operações (1 a 4): ");
        int e = scanner.nextInt();

        System.out.print("\nDigite dois números para essa operação: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        switch(e){
            case 1:
                double soma = num1 + num2;
                System.out.println("\nOperação: ADIÇÃO \n" + num1 + " + " + num2 + " = " + soma);
            break;
            case 2:
                double subtracao;
                if (num1 >= num2){
                    subtracao = num1 - num2;
                    System.out.println("\nOperação: SUBTRAÇÃO \n" + num1 + " - " + num2 + " = " + subtracao);
                }
                else{
                    subtracao = num2 - num1;
                    System.out.println("\nOperação: SUBTRAÇÃO \n" + num2 + " - " + num1 + " = " + subtracao);
                }
            break;
            case 3:
                double multiplicacao = num1 * num2;
                System.out.println("\nOperação: MULTIPLICAÇÃO \n" + num1 + " X " + num2 + " = " + multiplicacao);
            break;
            case 4:
                double divisao;
                if (num1 >= num2){
                    divisao = num1 / num2;
                    System.out.println("\nOperação: DIVISÃO \n" + num1 + " / " + num2 + " = " + divisao);
                }
                else{
                    divisao = num2 / num1;
                    System.out.println("\nOperação: DIVISÃO \n" + num2 + " / " + num1 + " = " + divisao);
                }
            break;
            default:
                System.out.print("\nOperação inválida!");
            break;
            
        }

        scanner.close();

    }
}
