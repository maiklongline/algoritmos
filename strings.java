import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class strings {
        //manipulação de strings com datas
    
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        System.out.println("Informe os números");
        //calculo de area e perimetro de triângulo
        double largura = 5.6, altura = 8.5;
        double a = largura * altura;
        double p = 2 * (largura + altura);
        System.out.println("area: "+a+" perimetro: "+p+"");

        //troca de variaveis
        int n = 4, b = 6 , temp;
        //uso de uma variavel temporaria só pra poder atribuir a troca
        temp = n;
        n = b;
        b = temp;
        System.out.println("a : "+n+ "\n b : "+b+"");

       System.out.println("Informe o número da tabuada que queira:");
       int number = e.nextInt();
    //    //tabuada sem atribuir loop
    //    System.out.println(""+number+"x1 = " + (number * 1));
    //    System.out.println(""+number+"x2 = " + (number * 2));
    //    System.out.println(""+number+"x3 = " + (number * 3));
    //    System.out.println(""+number+"x4 = " + (number * 4));
    //    System.out.println(""+number+"x5 = " + (number * 5));
    //    System.out.println(""+number+"x6 = " + (number * 6));
    //    System.out.println(""+number+"x7 = " + (number * 7));
    //    System.out.println(""+number+"x8 = " + (number * 8));
    //    System.out.println(""+number+"x9 = " + (number * 9));
    //    System.out.println(""+number+"x10 = " + (number * 10));
      
    //com loop
       for (int i = 0; i < 10; i++) {
     // Calculate and print the result of num1 multiplied by (i+1)
     System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1))); 

       }
       //are e permitro de circulo
       double area, perimetro, raio = 7.5;
      area = Math.PI * Math.pow(raio, 2);
      perimetro = 2 * Math.PI * raio;
      System.out.println("area igual a :"+area+" e perimetro é: "+perimetro+"");
       
        

  }
}
