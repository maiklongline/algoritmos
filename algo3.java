import java.util.Scanner;

public class algo3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
            double a,b, vf;
        System.out.println("Qual a altura?");
            a = e.nextDouble();
        System.out.println("Qual a base?");
            b = e.nextDouble();
            vf = (a+b)/2;
        // System.out.printf("Valor da área do triangulo é: %d%n ", + vf);
        System.out.println("o valor da área é: " + vf);
    }
}
