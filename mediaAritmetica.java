import java.util.Scanner;

public class mediaAritmetica {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            int media;
        System.out.println("Informe a primeira nota");
            int nota1 = e.nextInt();
        System.out.println("Informe a segunda nota");
            int nota2 = e.nextInt();
        System.out.println("Informe a terceira nota");
            int nota3 = e.nextInt();
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
                System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}