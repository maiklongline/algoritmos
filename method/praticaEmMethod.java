package method;

import java.util.Scanner;

public class praticaEmMethod {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // formasNumeros(leia);
        // parImpar(leia);
        // calcuSimples(leia);
        testNeps();
        desenhandoFormasQuadrado(leia);
        dessenhandoTriangulo(leia);
        
    }
    static void formasNumeros(Scanner leia){
        
        System.out.println("Informe um número");
            int num = leia.nextInt();

        if (num > 0 ) {
            System.out.println("número positivo");
        
        }else if(num < 0){
            System.out.println("número negativo");
        }else{
            System.out.println("NEUTRO");
        }
        
    }
    static void parImpar(Scanner leia){
        System.out.println("Informe um número para saber se é par ou ímpar");
            int num = leia.nextInt();
        if (num % 2 == 0) 
            System.out.println("par");
        else
            System.out.println("impar");
    }
    static void calcuSimples(Scanner leia){
        int operacao;   
        System.out.println("escolha sua operação");
            System.out.println("1 soma");
            System.out.println("2 subtração");
            System.out.println("3 multiplicação");
            
            System.out.println("Informe dois números para a operação");
                System.out.println("primeiro número");
                    int num1 = leia.nextInt();
                System.out.println("primeiro número");
                    int num2 = leia.nextInt();
                int result = 0;

                
            operacao = leia.nextInt();
        switch (operacao) {
            case 1:
               result = num1 + num2;
              
                break;
            case 2:
                result = num1-num2;
              
                break;
            case 3:
                result = num1 * num2;
                
                break;
            default:
                System.out.println("operação inválida"); 
        }
        System.out.println(result);
    }
    static void testNeps(){
        double nota1 = 10;
        double nota2 = 9.8;

        double media = (nota1 + nota2)/2;

        if(media >= 7){
            System.out.println("Aprovado");
        }else if ( media >= 4) {
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
    }
    public static void desenhandoFormasQuadrado(Scanner leia){
        System.out.println("Informe o tamanho");
       int tamanho = leia.nextInt();
        for(int linhas = 1 ; linhas <= tamanho; linhas++){
            System.out.println();
          for(int colunas = 1; colunas <= tamanho; colunas ++){
            System.out.print("* ");
          }
        
        }
        System.out.println();     
    }
    static void dessenhandoTriangulo(Scanner leia){
        System.out.println("Informe o número de linhas");
        int linhas = leia.nextInt();
        for(int i = 1; i <= linhas; i++){
            System.out.println();
            for(int j = 1; j <= linhas; j++){
                System.out.print("* ");
            }
        }
    }
}
