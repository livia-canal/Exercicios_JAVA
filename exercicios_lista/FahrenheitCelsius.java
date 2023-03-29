import javax.swing.JOptionPane;

public class FahrenheitCelsius {
    
    public static void main(String[] args) {
        /*7. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
        A formula de conversao e: C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
        e F a temperatura em Fahrenheit */
        double F = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em graus Fahrenheit: "));
        double C = 5.0 * (F - 32)/9.0;
        JOptionPane.showMessageDialog(null, F + " °F corresponde a " + C + " °C");
    }
}
