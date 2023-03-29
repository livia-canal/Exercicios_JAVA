import javax.swing.JOptionPane;

public class AcresM2{
    public static void main(String[] args) {
        /*25. Leia um valor de area em acres e apresente-o convertido em metros quadrados m2. A
        formula de conversao e: M = A ∗ 4048, 58, sendo M a area em metros quadrados e A aarea em acres. 
        */
        double acres = Double.parseDouble(JOptionPane.showInputDialog("Digite uma área acres: ")); 
        double m2 = acres * 4048.58;
        JOptionPane.showMessageDialog(null, acres + " acres corresponde a " + m2 + " metros quadrados"); 
    }
}