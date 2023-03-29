import javax.swing.JOptionPane;

public class SomaTres {

    public static void main(String[] args) {

       // 3. Peça ao usuario para digitar três valores inteiros e imprima a soma deles.
       int num1, num2, num3, soma;

       num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
       num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));

       soma = num1 + num2 + num3;

       JOptionPane.showMessageDialog(null, "A soma dos números é " + soma);
        
    }
    
}
