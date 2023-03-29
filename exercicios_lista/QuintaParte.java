import javax.swing.JOptionPane;

public class QuintaParte {
    
    public static void main(String[] args) {
        
       //5. Leia um numero real e imprima a quinta parte deste numero.
       double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));
       double quintaParte = num / 5;
       JOptionPane.showMessageDialog(null, "A quinta parte de " + num + " é " + quintaParte);
    }
}
