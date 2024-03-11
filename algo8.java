import java.util.Scanner;

public class algo8 {
//     Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos,
// para os quais fornece a quantidade de ração em gramas. A quantidade diária
// de ração fornecida para cada gato é sempre a mesma. Crie um algoritmo que
// receba o peso do saco de ração e a quantidade de ração fornecida para cada
// gato, calcule e mostre quanto restará de ração no saco após cinco dias. 
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
            double kg, gramas, resto, diaria;
        System.out.println("Informe a quantidade em kg de ração:");
        kg =r.nextDouble();
        System.out.println("Informe a quantidade em gramas:");
        gramas = r.nextDouble();

        diaria = (gramas*2) /1000;
        resto = kg - (diaria*5);
        System.out.println("nos cinco dias restará: "  + resto);
        
    }
}
