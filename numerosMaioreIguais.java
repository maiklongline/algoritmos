import java.util.Scanner;

public class numerosMaioreIguais {
//     Crie um algoritmo que leia dois números e informe qual deles é o maior. 
// Informe também caso os números sejam iguais.
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe os números");
           int  n1 = e.nextInt() , n2 = e.nextInt();
        if (n1 > n2) {
            System.out.println("O número maior é: " + n1);
        }else if (n2 > n1) {
            System.out.println("O número maior é:" + n2);

        }else if(n1 == n2){
            System.out.println("Os números são iguais");
        }
                
           
    }
}