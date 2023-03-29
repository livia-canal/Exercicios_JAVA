import javax.swing.JOptionPane;

public class QuatroDigitos{
    public static void main(String[] args) {
        //47. Leia um numero inteiro de 4 dıgitos (de 1000 a 9999) e imprima 1 dıgito por linha.
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 4 dígitos: "));
        int d4 = num % 10;
        num = num / 10;
        int d3 = num % 10;
        num = num / 10;
        int d2 = num % 10;
        int d1 = num / 10;

        JOptionPane.showMessageDialog(null, d1 + "\n" + d2 + "\n" + d3 + "\n" + d4);        
    }
}