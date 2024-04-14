import java.util.Scanner;

public class equacaoLineares {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.println("Informe o valor de A");
            int a = scan.nextInt();
        System.out.println("Informe o valor de B");
            int b = scan.nextInt();
        System.out.println("Informe o valor de C");
            int c = scan.nextInt();
        System.out.println("Informe o valor de D");
            int d = scan.nextInt();
        System.out.println("Informe o valor de E");
            int e = scan.nextInt();
        System.out.println("Informe o valor de F");
            int f = scan.nextInt();
        
        System.out.println("vamos resolver?");
        System.out.printf("%dx + %dy = %d%n", a ,b ,c);
        System.out.printf("%dx + %dy = %d%n", d ,e ,f);
        
        
    }
}
