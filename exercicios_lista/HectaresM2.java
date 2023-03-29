import javax.swing.JOptionPane;

public class HectaresM2{
    public static void main(String[] args) {
        /*27. Leia um valor de area em hectares e apresente-o convertido em metros quadrados  m2.
        A formula de conversao e: M = H ∗ 10000, sendo M a area em metros quadrados e H a area em hectares
        */
        double hectares = Double.parseDouble(JOptionPane.showInputDialog("Digite uma área em hectares: ")); 
        double m2 = hectares * 10000;
        JOptionPane.showMessageDialog(null, hectares + " hectares corresponde a " + m2 + " metros quadrados");
    }
}