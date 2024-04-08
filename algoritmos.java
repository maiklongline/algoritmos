import java.util.Scanner;
    // iniciando as atribuições com códigos usando If
public class algoritmos {
    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
            int num1;
            int num2;
            float div;
        System.out.println("Informe o primeiro número");
            num1 = e.nextInt();
        System.out.println("Informe o segundo");
            num2 = e.nextInt();
            
            div = (float) num1 / num2;
            System.out.println(div);
        if(num1 == num2){
            System.out.printf("%d == %n%d" , num1 ,num2);
        }    
    }
}
