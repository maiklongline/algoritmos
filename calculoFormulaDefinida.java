import java.util.Scanner;

public class calculoFormulaDefinida {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int a,b,c;
        double r,s,d;
        System.out.println("Informe os valor de a");
            a = e.nextInt();
        System.out.println("Informe os valor de b");
            b = e.nextInt();
        System.out.println("Informe os valor de c");
            c = e.nextInt();
        r = Math.pow(a + b, 2);
        s = Math.pow(b + c, 2);
        d = (r - s) /2;

        System.out.println("O valor predefindo em "+a+" , "+b+" e "+c+" resultou em" + d);
    }
}
