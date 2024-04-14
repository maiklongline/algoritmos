import java.util.Scanner;

public class definindoQualMaior {
    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
            int a = e.nextInt();
        System.out.println("Informe o segundo número");
            int b = e.nextInt();
        System.out.println("Informe o terceiro número");
            int c = e.nextInt();
        System.out.printf(" %n a: %d%n b: %d%n c: %d%n", a , b , c);
        if (a > b && a > c)  {
                System.out.println("o maior é : " + a);
        }else if (b > a && b > c) {
                System.out.println("o maior é : " + b);
        }else{
                System.out.println("o maior é : " + c);
        }
        
    }
}
