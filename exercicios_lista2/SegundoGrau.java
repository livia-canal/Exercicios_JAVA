import java.util.Scanner;

public class SegundoGrau {
    public static void main(String[] args) {
        /*25. Calcule as raızes da equacao de 2 o grau. A variavel a tem que ser diferente de zero. 
        Caso seja igual, imprima a mensagem “Nao e equacao de segundo grau”.
            • Se ∆ < 0, nao existe real. Imprima a mensagem Nao existe raiz.
            • Se ∆ = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz unica.
            • Se ∆ ≥ 0, imprima as duas raızes reais.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("EQUAÇÃO DE SEGUNDO GRAU \nDigite o valor do coeficinete a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor do coeficiente c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double delta = Math.pow(b, 2) - 4 * a *c;
            if(delta < 0){
                System.out.println("Não existe raiz!");

            }
            else if(delta == 0){
                double raiz = -(b)/ (2 * a);
                System.out.println("Raiz única! O valor da raiz é " + raiz);
            }
            else{
                double x1 = ( -b + Math.sqrt(delta)) / (2 * a);
                double x2 = ( -b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Os valores das raízes reais são " + x1 + " e " + x2);

            }

        }
        else{
            System.out.println("Não é equação de segundo grau!");
        }

        scanner.close();

    }
}
