import java.util.Scanner;

public class encontrandoIdadeEmDias {
    // Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
    //  meses e dias e mostre-a expressa apenas em dias.
    public static void main(String[] args) {
        Scanner e =new Scanner(System.in);
        System.out.println("Informe sua idade");
            double idade = e.nextInt();
        System.out.println("Informe os meses");
            double meses = e.nextInt();
        System.out.println("Informe os dias");
            double dias = e.nextInt();

             double diasTotais = idade * 365;
             diasTotais += meses * 30;

        System.out.println("O a idade em dias estabelece em:" + (diasTotais += dias));
       
      
    }
    
   
  
}
