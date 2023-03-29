import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        /*14. A nota final de um estudante e calculada a partir de tres notas atribuıdas entre o intervalo de 0 ate 10,
        respectivamente, a um trabalho de laboratorio, a uma avaliacao semestral e a um exame final. A media das tres 
        notas mencionadas anteriormente obedece aos pesos: Trabalho de Laboratorio: 2; Avaliacao Semestral: 3; 
        Exame Final: 5. De acordo com o resultado, mostre na tela se o aluno esta reprovado (media entre 0 e 2,9), 
        de recuperacao (entre 3 e 4,9) ou se foi aprovado. Faca todas as verificacoes necessarias. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10 && n3 >= 0 && n3 <= 10){

            double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
            
            if (media >= 0 && media <= 2.9){
                System.out.println("Media: " + String.format("%.1f", media) + "\nSituacao: REPROVADO");
            }
            else if ( media >= 3 && media <= 4.9){
                System.out.println("Media: " + String.format("%.1f", media) + "\nSituacao: RECUPERACAO");
            }
            else{
                System.out.println("Media: " + String.format("%.1f", media) + "\nSituacao: APROVADO");
            }
        }
        else{
            System.out.println("Nota invalida");
        }

        scanner.close();
    }
}
