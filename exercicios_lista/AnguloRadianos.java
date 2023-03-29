import javax.swing.JOptionPane;

public class AnguloRadianos {
    public static void main(String[] args) {
        /*15. Leia um angulo em radianos e apresente-o convertido em graus. A formula de conversao e:
        G = R ∗ 180/π, sendo G o angulo em graus e R em radianos e π = 3.14.
        */
        double aRadianos = Double.parseDouble(JOptionPane.showInputDialog("Digite um ângulo em radianos: "));
        double aGraus = aRadianos * 180 / 3.14;
        JOptionPane.showMessageDialog(null, "O ângulo " + aRadianos + " rad corresponde a " + aGraus + "°");
    }
}
