import java.util.Scanner;

public class algo7 {
    public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
        int a;  //ax^2
        int b;  //bx
        int c;  //c
     System.out.println("informe o valor de a"); 
        a = e.nextInt();
     System.out.println("informe o valor de b"); 
        b = e.nextInt();
     System.out.println("informe o valor de c"); 
        c = e.nextInt();

        double delta = Math.pow(b, 2) - (4*a*c);
        double numeradorx1 = -b+Math.sqrt(delta) /(2*a);
        double numeradorx2 = -b-Math.sqrt(delta)/ (2*a);
    System.out.printf("As duas raizes emitem dois valores %nx1 = %.2f%nx2 = %.2f%n ", numeradorx1, numeradorx2);
    }
}
