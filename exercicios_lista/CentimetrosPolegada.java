import javax.swing.JOptionPane;

public class CentimetrosPolegada {
    public static void main(String[] args) {
        
        /*17. Leia um valor de comprimento em centımetros e apresente-o convertido em polegadas.
        A formula de conversao e: P = C / 2,54 , sendo C o comprimento em centımetros e P o
        comprimento em polegadas
        */
        double vCm = Double.parseDouble(JOptionPane.showInputDialog("Digite um comprimento em centímetros"));
        double vPolegadas = vCm / 2.54;
        JOptionPane.showMessageDialog(null, "O comprimento " + vCm + " cm corresponde a " + vPolegadas + " in");
    }
}