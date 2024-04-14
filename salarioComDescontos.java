import java.util.Scanner;

public class salarioComDescontos {
//     Crie um algoritmo que receba o salário bruto de um funcionário e exiba o seu
// salário líquido, sabendo que ele tem 10% de gratificação sobre o salário bruto
// e tem 15% de descontos sobre o salário após a gratificação. 
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        double salarioBruto,salarioFinal;
    System.out.println("Qual o sálario:");
        salarioBruto =s.nextDouble();
        salarioFinal = (salarioBruto*10)/15;
    System.out.println("o sálario final ficou: " + salarioFinal);
}
}
