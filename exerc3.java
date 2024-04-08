import java.util.*;
public class exerc3 {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int codigoP,paisOrigem;
        int pesoP;
        double vf, pt = 0, pesoG, taxa;
        
       
            
        
        System.out.println("Informe o código do produto (entre 1 e 10)");
            codigoP = e.nextInt();

        if (codigoP < 1 || codigoP > 10) {
            System.out.println("informe um código válido");
            return;   
        }
        
        System.out.println("Informe o peso do produto em Kg");
        pesoP = e.nextInt();
        pesoG = pesoP * 1000;
        
        System.out.println("Peso "+pesoG+" g");
        switch (codigoP) {
            case 1,2,3,4:
                    pt = pesoG / 10;
                break;
            case 5,6,7:
                    pt = pesoG / 25;  
                break;
            case 8,9,10:
                pt = pesoG / 35;                
                break;
            default:
                System.out.println("código inexistente");
                break;
        }

    
        System.out.printf("O valor do produto em gramas ficou %.2fg e seu valor de produto total %05.2freais%n " , pesoG , pt);

        do {
            System.out.println("Informe o país de origem do produto (entre 1 e 3)");
                paisOrigem = e.nextInt();
        } while (paisOrigem <1 || paisOrigem >3); 

        
        switch (paisOrigem) {
            case 1:
                taxa = 0;                 
                break;
            case 2: 
                taxa = pt * 0.15;                 
                break;
            case 3 :
                 taxa = pt * 0.25;
                 break;
            default:
                taxa = 0;
                break;
        }

        System.out.println("valor do imposto estabaelecido "+taxa+"reais");
        
        vf = pt + taxa;

        System.out.println("O valor predefinido a pagar é:" + vf);

            
    }
}
