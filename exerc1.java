import java.text.Normalizer;
import java.util.*;
public class exerc1 {

    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        String opcao ;
        System.out.println("Escolha o plano desejado:");
        System.out.println("Básico");
        System.out.println("Bronze");
        System.out.println("Prata");
        System.out.println("ouro");
        opcao = e.nextLine();   
     
        switch (opcao) {
            case "Básico":
            case "Basico":
                System.out.println("O valor de seu plano é 150 reais");
            break;
            case "Bronze","bronze":
            System.out.println("O valor de seu plano é 220 reais ");
            break;
            case "prata","Prata":
            System.out.println("o valor do seu plano é 310 reais");
            break;
            case "Ouro","ouro":
            System.out.println("o valor do seu plano é 450 reais");
            break;
            default:
                System.out.println("Plano não existe");
                break;
        }
    }
}  

     
     



    

    

