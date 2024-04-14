import java.util.*;
public class conversaoDePes {
// Sabe-se que 1 𝑝é = 12 𝑝𝑜𝑙𝑒𝑔𝑎𝑑𝑎𝑠, 1 𝑗𝑎𝑟𝑑𝑎 = 3 𝑝é𝑠, 1 𝑚𝑖𝑙ℎ𝑎 = 1760 𝑗𝑎𝑟𝑑𝑎𝑠 .
// Crie um algoritmo que receba uma medida em pés, faça as conversões e
// mostre os resultados em:
    public static void main(String[] args) {
        Scanner medida = new Scanner(System.in);
            double pe, m1,m2,m3  ;
        System.out.println("Defina a medida em pés");
            pe = medida.nextDouble();
        m1 = pe * 12 ;
        m2 = (pe)/3;
        m3 = (pe) /5280;
        System.out.printf("o valor de pes para polgadas é: %npolegadas = %.2f%njardas = %.2f%nmilhas = %.2f%n ", m1,m2,m3);

        }
}
