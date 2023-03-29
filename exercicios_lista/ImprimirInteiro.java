import javax.swing.JOptionPane;

public class ImprimirInteiro {
    public static void main (String [] args){

       //1.  Faça um programa que leia um numero inteiro e o imprima
       int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
       JOptionPane.showMessageDialog(null, "O número inteiro é " + num);     
    
    }
}