import java.util.*;
public class equacaoGrau2 {
// Crie um algoritmo que resolva a seguinte equação 𝑥
// 2 − 5𝑥 + 6 = 0. 
    
    public static void main (String[] args) {
    Scanner e = new Scanner(System.in);
            int a = 0;      //x^2
            int b  = 0;     // -5
            int c = 0;      // 6
        System.out.println("Informe o valor de a");
            a = e.nextInt();
        System.out.println("Informe o valor de b");
            b = e.nextInt();
        System.out.println("Informe o valor de c");
            c = e.nextInt();

            double delta = Math.pow(b, 2) - (4*a*c);
            double numeradorx1 = -b+Math.sqrt(delta) /(2*a);
            double numeradorx2 = -b-Math.sqrt(delta)/ (2*a);
        System.out.printf("a equação possui duas raizes sendo uma %nx1 = %.2f%nx2 = %.2f%n", numeradorx1 , numeradorx2 );
   
    

    }
    
}


