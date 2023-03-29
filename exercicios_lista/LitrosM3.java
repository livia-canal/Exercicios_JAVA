import javax.swing.JOptionPane;

public class LitrosM3{
    public static void main(String[] args) {
        /*19. Leia um valor de volume em litros e apresente-o convertido em metros cubicos m3. A
        formula de conversao e: M = L / 1000 , sendo L o volume em litros e M o volume em metros cubicos.
        */
        double L = Double.parseDouble(JOptionPane.showInputDialog("Digite um volume em metros cúbicos: ")); 
        double M3 = L / 1000; 
        JOptionPane.showMessageDialog(null, L + " litros corresponde a " + M3 + " metros cúbicos");
    }       
}