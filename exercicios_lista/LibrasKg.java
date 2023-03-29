import javax.swing.JOptionPane;

public class LibrasKg{
    public static void main(String[] args) {
        /*21. Leia um valor de massa em libras e apresente-o convertido em quilogramas. A formula de conversao e: 
        K = L ∗ 0.45, sendo K a massa em quilogramas e L a massa em libras.
        */
        double lb = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em libras: "));
        double kg = lb * 0.45;
        JOptionPane.showMessageDialog(null, lb + "lb corresponde a " + kg + "Kg");
    }
}
