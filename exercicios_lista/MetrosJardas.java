import javax.swing.JOptionPane;

public class MetrosJardas {
    public static void main(String[] args) {
        /*23. Leia um valor de comprimento em metros e apresente-o convertido em jardas. A formula de conversao e:
        J = M / 0,91 , sendo J o comprimento em jardas e M o comprimento em metros.
        */
        double metros = Double.parseDouble(JOptionPane.showInputDialog("Digite um comprimento em metros")); 
        double jardas = metros / 0.91;
        JOptionPane.showMessageDialog(null, metros + " metros corresponde a " + jardas + " jardas");
    }
}