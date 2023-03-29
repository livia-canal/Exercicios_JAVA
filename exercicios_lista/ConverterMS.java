import javax.swing.JOptionPane;

public class ConverterMS {
    public static void main(String[] args) {
        /*11. Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h
        (quilometros por hora). A formula de conversao e: K = M ∗ 3.6, sendo K a velocidade
        em km/h e M em m/s. */
        double mS = Double.parseDouble(JOptionPane.showInputDialog("Digite uma velocidade em m/s: "));
        double kmH = mS * 3.6;
        JOptionPane.showMessageDialog(null, "A velocidade " + mS + " m/s é " + kmH + " em Km/h");
    }
}
