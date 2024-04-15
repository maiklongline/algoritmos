import java.util.Scanner;

public class trianguloTipos {
//     Crie um algoritmo que dados três valores X, Y e Z, verifique se eles podem 
// ser os comprimentos dos lados de um triângulo e, se forem, verifique se é um 
// triângulo equilátero, isósceles ou escaleno. Considere que: 
// • O comprimento de cada lado de um triângulo é menor do que a soma 
// dos outros dois lados; 
// • Chama-se equilátero o triângulo que tem três lados iguais;
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            double x,y,z;
            System.out.print("Informe três valores:");
                x = e.nextDouble();
                y = e.nextDouble();
                z = e.nextDouble();
        if (x + y >z && x + z > y && z + y > x)  {
            System.out.println("Isto é um triângulo");
        } else if (x+y < z && x + z < y && z + y < x){
            System.err.println("Não é um triângulo");
        }else if (x == y  && y == x && y == z && z == x ) {
            System.out.println("Isto é um triângulo: Equilátero");
        }else if ((x == y)|| (y == x)) {
            System.out.println("isto é um triângulo: Isóceles");
        }else {
            System.out.println("Isto é um triângulo: Escaleno");
        }
    }
}
