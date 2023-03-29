import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        /*20. Dados tres valores, A, B, C, verificar se eles podem ser valores dos lados de um triangulo e, 
        se forem, se e um triangulo escaleno, equilatero ou isoscele, considerando os seguintes conceitos:
            • O comprimento de cada lado de um triangulo e menor do que a soma dos outros dois lados.
            • Chama-se equilatero o triangulo que tem tres lados iguais. 
            • Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais. 
            • Recebe o nome de escaleno o triangulo que tem os tres lados diferentes. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("TRIÂNGULO \nDigite o valor do lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < b + a){
            if (a == b && a == c ){
                System.out.println("TRIÂNGULO EQUILÁTERO!");
            }
            else if(a == b || a == c || b == c){
                System.out.println("TRIÂNGULO ISÓSCELES!");
            }
            else{
                System.out.println("TRIÂNGULO ESCALENO!");
            }
        }
        else{
            System.out.print("Não é um triângulo!");
        } 
        
        scanner.close();
    }
}
