import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        /*9. Leia o salario de um trabalhador e o valor da prestacao de um emprestimo. 
        Se a prestacao for maior que 20% do salario imprima: Emprestimo nao concedido, 
        caso contrario imprima: Emprestimo concedido.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do seu salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o valor da prestacao: ");
        double prestacao = scanner.nextDouble();

        double x = salario * 0.2;

        if (prestacao > x){
            System.out.print("Emprestimo nao concedido");
        }
        else{
            System.out.print("Emprestimo concedido");
        }

        scanner.close();

    }
}
