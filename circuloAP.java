import java.util.*;
public class circuloAP {
//     Crie um algoritmo que receba o raio de um círculo, calcule e mostre a sua
// área e o seu perímetro. 
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
            double r,a,p;
        System.out.println("qual o raio do círculo?");
            r = c.nextDouble();
            a = Math.PI * Math.pow(r, 2);
        System.out.printf("O valor da area é: %.2f%n" , a);
            p = 2 * Math.PI * r;
         System.out.printf("O valor do perimentro é: %.2f%n" , p);
       
       
    
    }
    
}
