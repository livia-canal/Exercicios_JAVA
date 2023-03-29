import javax.swing.JOptionPane;

public class Concurso {
    public static void main(String[] args) {
        /*39. A importancia de R$ 780.000,00 ser a dividida entre tres ganhadores de um concurso.
        Sendo que da quantia total:
            • O primeiro ganhador recebera 46%; 
            • O segundo recebera 32%; 
            • O terceiro recebera o restante; 
        Calcule e imprima a quantia ganha por cada um dos ganhadores. */

        double premio = 780000.00;
        double primeiro = premio * 0.46; 
        double segundo = premio * 0.32; 
        double terceiro = premio - (primeiro + segundo);

        JOptionPane.showMessageDialog(null, "GANHADORES:\n• O primeiro ganhador receberá: R$" + primeiro + 
        "\n• O segundo ganhador receberá: R$" + segundo + "\n• O terceiro ganhador receberá: R$" + terceiro);
    }
}