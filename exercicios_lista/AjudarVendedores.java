import javax.swing.JOptionPane;

public class AjudarVendedores{
    public static void main(String[] args) {
        /*43. Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
            • o total a pagar com desconto de 10%;
            • o valor de cada parcela, no parcelamento de 3× sem juros;
            • a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
            • a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total) 
        */
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total do produto: "));
        double desconto = valorTotal - (valorTotal * 0.10);
        double parcela = valorTotal / 3;
        double comissao1 = desconto * 0.05;
        double comissao2 = valorTotal * 0.05;

        JOptionPane.showMessageDialog(null, "• Valor total: R$" + valorTotal + "\n• Valor a vista com 10% de desconto: R$"
        + desconto + "\n• Valor da parcela em 3x sem juros: R$" + parcela + "\n• Comissão do vendedor, no caso de venda a vista: R$" 
        + comissao1 + "\n• Comissão do vendedor, no caso de venda parcelada: R$" + comissao2);
    
    }
}