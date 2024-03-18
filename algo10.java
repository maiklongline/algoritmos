import java.util.Scanner;

public class algo10 {
//     Crie um algoritmo que receba os valores dos catetos de um triângulo, calcule
// e mostre o valor da hipotenusa

public static void main(String[] args) {
    Scanner ler= new Scanner(System.in); //obter a entrada do usuário apartir do teclado
        double c1, c2 , h;

    System.out.println("informe o valor do primeiro cateto:");
        c1 = ler.nextDouble();
    System.out.println("informe o valor do segundo cateto:");
        c2 = ler.nextDouble();
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
    System.out.println("O valor da hipotenusa após a soma dos catetos são : " + h);    
            
}
}
