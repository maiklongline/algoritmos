import java.util.Scanner;

public class algoritimos2 {
    // Crie um algoritmo que leia 3 números e informe qual o menor.

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Infomre os 3 números");
        int n1 = e.nextInt(),n2 = e.nextInt(),n3 = e.nextInt();
        int menor;
        if(n1 < n2 && n2 < n3){
            menor = n1;
        }else if (n2 < n1 && n2 < n3) {
            menor = n2;

        }else  {
            menor = n3;
        }
        System.out.println("o valor menor é: " + menor);
    }
}
