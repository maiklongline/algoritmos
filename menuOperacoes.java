import java.util.Scanner;

public class menuOperacoes {
    // Crie um algoritmo que mostre o menu de opções a seguir, receba a opção do 
//usuário e os dados necessários para executar cada operação.
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            int opcao = 0;
            double n1,n2,resultado;
            System.out.println("Escolha as opções:");
            System.out.println("1 para somar dois números");
            System.out.println("2 para uma raiz quadrada de um número");
            System.out.println("3 para elevar um número a uma potência");
            opcao = e.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro número");
                        n1 = e.nextDouble();
                    System.out.println("Digite o segundo número");  
                        n2 = e.nextDouble();
                    resultado = n1 + n2;    
                    System.out.println("O valor final é:" + resultado);  
                    break;
                case 2: 
                    System.out.println("Digite o valor da raiz");
                        n1 = e.nextDouble();
                    resultado = Math.sqrt(n1);
                    System.out.println("O valor é:" + resultado);
                    break;
                case 3 :
                    System.out.println("Digite o número a elevar");
                        n1 = e.nextDouble();
                        resultado = Math.pow(n1, 2);  
                    System.out.println("O valor final é:" + resultado);
                        break;
                default:
                    resultado = 0;
                    break;
            }
        }
    }

