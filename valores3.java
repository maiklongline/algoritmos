import java.util.Scanner;

public class valores3 {
//     Crie um algoritmo que leia 3 valores e informe se o 3º valor informado está 
// entre os 2 primeiros.
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            System.out.println("Informe o primeiro valor");
                int n1= e.nextInt();
            System.out.println("Informe o primeiro valor");
                int n2= e.nextInt();
            System.out.println("Informe o primeiro valor");
                int n3= e.nextInt();
            if ((n3 > n1 && n3 < n2) || (n3 < n1 && n3 > n2)) {
                System.out.print("o terceiro valor está entre os três primeiros");

            }else{
                System.out.print("O terceiro valor não está entre os dois primeiros.\n");
            }

    }
}
