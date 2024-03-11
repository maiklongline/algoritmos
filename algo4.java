import java.util.Scanner;

public class algo4 {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        double salarioBruto,salarioFinal;
    System.out.println("Qual o sálario:");
        salarioBruto =s.nextDouble();
        salarioFinal = (salarioBruto*10)/15;
    System.out.println("o sálario final ficou: " + salarioFinal);
}
}
