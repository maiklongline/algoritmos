import java.util.Scanner;

public class informandoPesoPorSexo {
//     Crie um algoritmo que receba como entrada o sexo de uma pessoa (M para 
// Masculino e F para Feminino), sua altura (em centímetros) e calcule o seu 
// peso ideal, utilizando as seguintes fórmulas: 
// a) Homens ➔ 52 + (0,75 * (altura - 152,4)) 
// b) Mulheres ➔ 52 + (0,67 * (altura - 152,4))
    public static void main(String[] args) {
       Scanner e =new Scanner(System.in); 
       System.out.println("Informe seu sexo M ou F");
       char sexo = e.next().charAt(0); /*Uso da variável char por conta, que é possível atribuir dois 
                                                 valores em um campo vazio */
       System.out.println("INFORME SUA ALTURA : ");
        double altura = e.nextDouble();
        double p ;
        if (sexo == 'M') {
            p = 52 + (0.75 * (altura - 152.4));
            System.out.printf("O peso ideal para o homem é : %05.2f%n" , p);
        }else if (sexo == 'F') {
            p = 52 + (0.67 *(altura - 152.4));
            System.out.printf("O peso ideal para a mulher é : %05.2f%n" , p );

        }else{
            System.out.println("O valor é invalido");
        }
    }
}
