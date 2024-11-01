import java.util.Scanner;

public class gestao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // int num1;
        // int num2;


        // System.out.println("informe o primeiro número");
        // num1 = ler.nextInt();

        // System.out.println("informe o segundo número");
        // num2 = ler.nextInt();
        // if (num1 > num2) {
        //     System.out.println("o maior é:" + num1);
        // }else if (num2 > num1) {
        //     System.out.println("o maior é o segundo: " +num2);
        // }else{
        //     System.out.println("São iguais");
        // }
        
        // lendo3Numeros(ler);
        // classificacaoAluno(ler);
        analise3valores(ler);
    }

    static void lendo3Numeros(Scanner ler){
        System.out.println("Informe 3 números de sua escolha");
        int num1 = ler.nextInt() , num2 = ler.nextInt(), num3= ler.nextInt();

        if (num1 < num2 || num1 < num3) {
            System.out.println("O menor: "+ num1);
        }else if(num2 < num1 || num2 < num3){
            System.out.println("o menor:" + num2);
        }else if (num3 < num1 || num3 < num2) {
            System.out.println("o menor: " +num3);
        }else{
            System.out.println("NÃO HÁ MENORES ");
        }

        }

        static void classificacaoAluno(Scanner ler){
            int nota1 , nota2, nota3,nota4;
            int media = 0;
            String classificacao = "";
            do {
                System.out.println("Informe a primeira nota");
                 nota1 = ler.nextInt();
                System.out.println("Informe a segunda nota");
                 nota2 = ler.nextInt();
                System.out.println("Informe a terceira nota");
                 nota3 = ler.nextInt();
                System.out.println("Informe a quarta nota");
                 nota4 = ler.nextInt();

                if (nota1 < 10 || nota1 > 100 || nota2 < 10 || nota2 > 100 || nota3 < 10 
                || nota3 > 100 || nota4 < 10 || nota4 > 100) {
                    System.out.println("informe uma nota por dezena");
                }
            } while (nota1 < 10 || nota1 > 100 || nota2 < 10 || nota2 > 100 || nota3 < 10 || nota3 > 100 || nota4 < 10 || nota4 > 100);
            
            System.err.println("Vamos prosseguir");

            media = (nota1 + nota2 + nota3 + nota4)/4;

            if (media <= 20) {
                classificacao = "Pessimo";
            }else if (media > 20 || media <= 40) {
                classificacao = "ruim";
            }else if (media > 40 || media >=60) {
                classificacao ="regular";
            }else if (media > 60 || media <= 80) {
                classificacao = "bom";

            }else if (media > 80) {
                classificacao = "otimo";
            }
             
            

            System.out.println("sua media definida:" + media);
            System.out.println("Voce ficou classificado em:" + classificacao);
        }

        static void analise3valores(Scanner ler){
            int valorA;
            int valorB;
            int valorC;

            do {
                System.out.println("informe o primeiro valor:");
                valorA = ler.nextInt();
                System.out.println("informe o segundo valor:");
                valorB = ler.nextInt();
                System.out.println("informe o terceiro valor:");
                valorC = ler.nextInt();

                if (valorA > 50 || valorB > 50 || valorC > 50) {
                    System.out.println("informe valores menores que 50");
                }
            } while (valorA > 50 || valorB > 50 || valorC > 50);

            System.out.printf("Encontrar o intervalo %n seus valores:%n n1:%d%n n2:%d%n n3:%d%n" , valorA , valorB , valorC);
            

            int maior;
            int menor;

            if (valorA < valorB) {
                menor = valorA;
                maior = valorB;

                if (valorC >= menor || valorC >= maior ) {
                    System.out.println("O terceiro valor está entre os 2 primeiros: " + valorC);
                }
            }else if (valorB < valorA) {
                menor = valorB;
                maior= valorA;

                if (valorC >= menor || valorC >= maior) {
                    System.out.println("O terceiro valor está entre os 2 primeiros: " + valorC);
                }
            }
        }
    }
