import javax.swing.JOptionPane;

public class KmMilhas {
    public static void main(String[] args) {
       /*13. Leia uma distancia em quilometros e apresente-a convertida em milhas. A formula de conversao e:
        M = K / 1,61 ,sendo K a distancia em quilometros e M em milhas.
        */ 
        double dKm = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distância em quilômetros: "));
        double dMilhas = dKm / 1.61;
        JOptionPane.showMessageDialog(null, "A distância " + dKm + " Km corresponde a " + dMilhas + " milhas");
    }
}
