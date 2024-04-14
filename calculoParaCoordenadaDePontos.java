import java.util.*;
public class calculoParaCoordenadaDePontos {
    
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        double x1,x2,y1,y2,d;
        System.out.println("Informe o primeiro ponto");
            x1 = e.nextDouble();
        System.out.println("Informe o segundo ponto");
            y1 = e.nextDouble();
        System.out.println("Informe o primeiro ponto do outro plano");
            x2 = e.nextDouble();
        System.out.println("Informe o segundo ponto do outro plano");
            y2 = e.nextDouble();
           
        d = Math.sqrt(Math.pow(x1- x2, 2)+ (Math.pow(y1 - y2, 2)));
        System.out.printf("O valor da coordenada: x1 = %05.2f%n y1= %05.2f%n x2 =%05.2f%n y2 = %05.2f%n resultou em = %05.2f ", x1 , y1, x2 , y2 , d );



    }
}
