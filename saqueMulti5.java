import java.util.Scanner;

public class saqueMulti5 {
//      Crie um algoritmo que receba como entrada o valor do saque a ser realizado
// pelo cliente de um banco e retorne quantas notas de cada valor serão
// necessárias para atender ao saque com a menor quantidade de notas
// possível. Serão utilizadas notas de 100, 50, 20, 10 e 5 reais. Dica ➔ lembrese do operador de resto da divisão de inteiros (%). Considere que os valores
// informados para saque serão sempre múltiplos de 5.
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
           int valorSaque,notas100,notas50,notas20,notas10,notas5,notas2,resto;
        System.out.println("Informe o valor do saque:");
            valorSaque = e.nextInt();
            // notas de 100
            notas100 = valorSaque/100;
            resto = valorSaque %100;
            // notas de 50
            notas50 =resto/ 50;
            resto = resto % 50;
            // notas de 20
            notas20 = resto /20;
            resto %= 20;
            // notas de 10
            notas10= resto /10;
            resto %= 10;
            // notas de 5
            notas5= resto /5;
            resto %= 5;
            //notas de 2
            notas2 = resto /2;
            resto %= 2;

        System.out.println("Quantidade de notas");
        System.out.println("notas de 100:"  + notas100);
        System.out.println("notas de 50:"  + notas50);
        System.out.println("notas de 20:"  + notas20);
        System.out.println("notas de 10:"  + notas10);
        System.out.println("notas de 5:"  + notas5);
        System.out.println("notas de 2:"  + notas2);

             


           
           
            


        
    }
}
