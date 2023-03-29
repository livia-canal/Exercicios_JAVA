import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        /*13. Faca um algoritmo que calcule a media ponderada das notas de 3 provas. A primeira e a 
        segunda prova tem peso 1 e a terceira tem peso 2. Ao final, mostrar a media do aluno e indicar 
        se o aluno foi aprovado ou reprovado. A nota para aprovacao deve ser igual ou superior a 60 pontos.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1 * 1 + n2 * 1 + n3 * 2) / 4;

        if (media * 10 >= 60){
            System.out.println("Media = " + media + "\nSituacao: APROVADO!");
        }else{
            System.out.println("Media = " + media + "\nSituacao: REPROVADO!");
        }

        scanner.close();
    }
}
