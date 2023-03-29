import javax.swing.JOptionPane;

public class Hipotenusa{
    public static void main(String[] args) {
        
        /*35. Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equacao:
        hipotenusa = √ a2 + b2. Faca um programa que receba os valores de a e b e calcule o 
        valor da hipotenusa atraves da equacao. Imprima o resultado dessa operacao. */

        double a, b, hipotenusa;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto B: "));

        hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo corresponde a " + hipotenusa);
    }
}