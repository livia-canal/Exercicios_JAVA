import javax.swing.JOptionPane;

public class AreaQuadrado{
    public static void main(String[] args) {

        //33. Leia o tamanho do lado de um quadrado e imprima como resultado a sua area.
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do lado de um quadrado: "));
        double area = lado * lado;
        JOptionPane.showMessageDialog(null, "A área do quadrado é " + area);     

    }
}