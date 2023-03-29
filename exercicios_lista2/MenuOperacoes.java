import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        /*21. Escreva o menu de opcoes abaixo. Leia a opcao do usuario e execute a operacao escolhida. 
        Escreva uma mensagem de erro se a opcao for invalida. Escolha a opcao:
            1- Soma de 2 numeros.
            2- Diferenca entre 2 numeros (maior pelo menor).
            3- Produto entre 2 numeros.
            4- Divisao entre 2 numeros (o denominador nao pode ser zero).
            Opcao
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPERAÇÕES");
        System.out.println("1- Soma de 2 numeros. \n2- Diferenca entre 2 numeros (maior pelo menor). \n3- Produto entre 2 numeros. \n4- Divisao entre 2 numeros (o denominador nao pode ser zero).");
        System.out.print("Escolha uma das opções: ");
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
                if (num1 != 0){ 
                    divisao = num1 / num2;
                    System.out.println("\nOperação: DIVISÃO \n" + num1 + " / " + num2 + " = " + divisao);                              
                }
                else{
                    System.out.println("\nDenominador 0! Não é possível realizar essa operação.");
                }
            break;
            default:
                System.out.print("\nErro \nOperação inválida!");
            break;            
        }

        scanner.close();
        
    }
}
