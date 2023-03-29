import javax.swing.JOptionPane;

public class CelsiusKelvin {
    public static void main(String[] args) {
        
        /*9. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. 
        formula de conversao e: K = C + 273.15, sendo C a temperatura em Celsius e K a
        temperatura em Kelvin.*/
        double C = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em graus Celsius: "));
        double K = C + 273.15;
        JOptionPane.showMessageDialog(null, C + " °C corresponde a " + K + " K");
    }
}
