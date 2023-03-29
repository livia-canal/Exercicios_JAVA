import javax.swing.JOptionPane;

public class AntecessorSucessor{
    public static void main(String[] args) { 

      //31. Leia um numero inteiro e imprima o seu antecessor e o seu sucessor
      int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
      int antecessor = num - 1;
      int sucessor = num + 1;
      JOptionPane.showMessageDialog(null, "Número:  " + num + " " + "Antecessor: " + antecessor + " " + "Sucessor: " + sucessor);
    
    }
}