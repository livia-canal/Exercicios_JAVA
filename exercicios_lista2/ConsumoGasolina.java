import java.util.Scanner;

public class ConsumoGasolina{
    public static void main (String[] args){
        /*26. Leia a distancia em Km e a quantidade de litros de gasolina consumidos por um carro
        em um percurso, calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela abaixo: 
        | CONSUMO   | (Km/l) | MENSAGEM         |
        | menor que |    8   | Venda o carro!   |
        | entre     | 8 e 14 | Economico!       | 
        | maior que |   12   | Super economico! |
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância percorrida em Km: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite a quantidade de gasolina consumida no percurso em litros: ");
        double litros = scanner.nextDouble();

        double consumo = distancia / litros;

        if (consumo < 8){
            System.out.println("Venda o carro!");
        }
        else if(consumo >= 8 && consumo <= 14){
            System.out.println("Econômico!");
        }
        else{
            System.out.println("Super Econômico!");
        }

        scanner.close(); 

    }
}