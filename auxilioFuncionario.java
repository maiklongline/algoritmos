import java.util.Scanner;

public class auxilioFuncionario{
//     Crie um algoritmo que leia o salário de um funcionário, calcule e mostre seu 
// novo salário acrescido de bonificação e auxílio escola:
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            double salario, ns , aux1 = 350, aux2= 300 ,bonificacao = 0,  b;
            System.out.print("informe o salário");
                salario = e .nextDouble();
                
            if (salario > 2000 && salario <=2500)  { 
                ns = salario + aux1;
            }else if (salario > 2500 && salario <=2999) {
               ns = salario + aux2;
            }else{
                ns = salario;
            }
          
            if (salario < 2000) {
                bonificacao = 0.10;
            }else if (salario >= 2000 && salario <3000) {
                bonificacao = 0.08;
            }else if (salario >=3000){
                bonificacao = 0.05;
            }
           b = salario * bonificacao;
            ns += b;
            System.out.println("O meu valor acrescido aos benefícios é: " + ns);


            
            


            
                
            
                
            


    }
}