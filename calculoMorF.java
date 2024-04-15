import java.util.Scanner;
import java.util.Locale;
public class calculoMorF {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in).useLocale(Locale.US);
            double altura, peso;
            String dados;
            
        System.out.println("Informe seu sexo:");
        System.out.println("M para masculino");
        System.out.println("F para feminino");
            dados = e.next();
        switch (dados) {
            case "m":
            case "M":
                System.out.println("Informe sua altura em metros:");
                    altura = e.nextDouble();
                    peso = (72.7*altura)-58;
                System.out.printf("o peso ideal para sexo masculino é : %05.2f%n", peso);
                
                break;
            case "f":
            case "F":
                    System.out.println("Informe sua altura:");
                    altura = e.nextDouble();
                    peso = (62.1*altura)-44.7;
                System.out.printf("o peso ideal para sexo feminino é : %05.2f%n", peso);
                break;
            default:
                System.err.println("SEXO INVÁLIDO");
                break;
        }    

    }
}