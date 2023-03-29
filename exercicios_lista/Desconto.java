import javax.swing.JOptionPane;

public class Desconto{

    public static void main(String[] args) {
        
        /*37. Faca um programa que leia o valor de um produto e imprima o valor com desconto, tendo
        em vista que o desconto foi de 12% */ 
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto (R$): "));
        double desconto = valor * 0.12;
        valor = valor - desconto;
        JOptionPane.showMessageDialog(null, "O valor do produto com desconto é R$" + valor);
    }
}
