import javax.swing.JOptionPane;

public class Funcionario{
    public static void main(String[] args) {
        /*41. Faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas 
        trabalhadas no mes. Imprima o valor a ser pago ao funcionario, adicionando 10% sobre o 
        valor calculado. */

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora de trabalho do funcionário (R$): "));
        double horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas no mês: "));

        double salario = valor * horas * 1.10;
        
        JOptionPane.showMessageDialog(null, "O salário mensal do funcionário é R$" + salario);
    }
}