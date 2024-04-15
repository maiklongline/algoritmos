import java.util.Scanner;

public class parOuImpar {
    
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
            System.out.println("Informe número");
                int number = e.nextInt();
            if (number % 2 == 0) {
                System.out.println("este número é par");
            }else{
                System.out.println("este número é impar ");
            }
            
            if (number < 0) {
                System.out.println("número positivo");
            }else if (number > 0) {
                System.out.println("número negativo");
            }else{
                System.out.println("número zero");
            }
            
    }
}
