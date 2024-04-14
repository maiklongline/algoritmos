import java.util.Scanner;

public class carroValor {
    // O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
    //  distribuidor e dos impostos (aplicados ao custo de fábrica).
    //   Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
    //  escrever um algoritmo que leia o custo de fábrica de um carro e escreva o custo ao consumidor;
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            double custoF, valorD,valorF;
            System.out.println("Qual o custo de fábrica?");
                custoF = e.nextDouble();
            //multiplicar o valor total por 28%, para declarar ao distribuidor
                valorD = custoF * 0.28 ;
            //Nisso ao valor atribuido com os distribuidor 
            //devemos definir o imposto declarado que foi de 45%;
                valorF= (custoF + valorD) * 0.45;
            System.out.println("O valor final ao consumidor ficou: " + valorF);

    }
}