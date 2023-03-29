import javax.swing.JOptionPane;

public class MediaNotas{
    public static void main(String[] args) {
        //29. Leia quatro notas, calcule a media aritmetica e imprima o resultado.
        double n1, n2, n3, n4, media;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota:"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota:"));
 
        media = (n1 + n2 + n3 + n4) / 4;
 
        JOptionPane.showMessageDialog(null, "A média aritmética das notas é " + media);
    }
}