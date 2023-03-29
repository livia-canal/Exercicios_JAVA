import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        /*22. Leia a idade e o tempo de servico de um trabalhador e escreva se ele pode ou nao se
        aposentar. As condicoes para aposentadoria sao
        • Ter pelo menos 65 anos,
        • Ou ter trabalhado pelo menos 30 anos,
        • Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos. 
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("APOSENTADORIA \nDigite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Tempo de serviço (em anos): ");
        int tempo = scanner.nextInt();

        if(idade >= 65 || tempo >= 30 || idade >= 60 && tempo >= 25){
            System.out.println("Sua idade ou tempo de serviço correspondem aos requisitos. Você pode se aposentar!");
        }
        else{
            System.out.println("Sua idade ou tempo de serviço não correspondem aos requisitos. Não pode se aposentar.");
        }

        scanner.close();
    }
}
