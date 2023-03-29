import java.util.Scanner;

public class ImpostoProduto {
    public static void main(String[] args) {
        /*24. Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
        possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). 
        Faca um programa em que o usuario entre com o valor e o estado destino do produto e o
        programa retorne o preco final do produto acrescido do imposto do estado em que ele 
        sera vendido. Se o estado digitado nao for valido, mostrar uma mensagem de erro. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o estado destino do produto (MG, SP, RJ, MS): ");
        String estado = scanner.next();
        estado = estado.toUpperCase();

        double pFinal;

        switch(estado){
            case "MG":
                pFinal = valor * 1.07;
                System.out.println("O preço final do produto é R$" + String.format("%.2f", pFinal) + " com 7% de acréscimo e destino para Minas Gerais.");
            break;
            case "SP":
                pFinal = valor * 1.12;
                System.out.println("O preço final do produto é R$" + String.format("%.2f", pFinal) + " com 12% de acréscimo e destino para São Paulo.");
            break;
            case "RJ":
                pFinal = valor * 1.15;
                System.out.println("O preço final do produto é R$" + String.format("%.2f", pFinal) + " com 15% de acréscimo e destino para Rio de Janeiro.");
            break;
            case "MS":
                pFinal = valor * 1.08;
                System.out.println("O preço final do produto é R$" + String.format("%.2f", pFinal) + " com 15% de acréscimo e destino para Mato Grosso do Sul.");
            break;
            default:
                System.out.println("O estado digitado não é válido.");
            break;
        }

        scanner.close();

    }
}
