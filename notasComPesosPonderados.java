import java.util.*;
public class notasComPesosPonderados {
    // Faça um algoritmo que leia a idade de uma pessoa expressa em dias 
    // e mostre-a expressa em anos, meses e dias.
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
            int nota1 = e.nextInt();
        System.out.println("Informe a primeira nota");
            int nota2 = e.nextInt();
        System.out.println("Informe a primeira nota");
            int nota3 = e.nextInt();
        double media = (nota1 * 2.5 + nota2 * 2.5 + nota3 * 5) / (2.5 + 2.5 + 5);
       
        System.out.println("A media ponderada ficou: " + media);

    }
}
