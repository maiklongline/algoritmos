import java.util.Scanner;

public class saoMultiplos{

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe o primeiro valor inteiro");
            int n1= e.nextInt();
        System.out.println("Informe o segundo valor inteiro");
            int n2 = e.nextInt();
            int multi = n1 % n2;
        if (multi == 0){
            System.out.println("São Multiplos");
        } else{
            System.out.println("Não são multiplos");
        }


    }
}