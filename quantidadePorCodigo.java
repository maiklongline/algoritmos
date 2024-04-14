import java.util.Scanner;

public class quantidadePorCodigo {
    
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
            String codigo;
            double quantidade ,total;
        System.out.println("Informe o código do produto");
        System.out.println("A001 - R$7,50");
             String p1 = "salgadinho";
        System.out.println("A002 - R$9,90");
             String p2 = "Feijão";
        System.out.println("A003 - R$14,00");
             String p3 = "Sabâo líquido";
        System.out.println("A004 - R$19,99");
             String p4 = "Tapu é";
            codigo = e.nextLine();

        switch (codigo) {
            case "A001":
                
                System.out.println("Informe a quantidade desejada:");
                        quantidade = e.nextDouble();
                        total = quantidade * 7.5;
                System.out.printf("Você deve pagar o total de: %.2f do %s%n" ,total,p1);
                break;
                case "A002":
                System.out.println("Informe a quantidade desejada:");
                        quantidade=e.nextDouble();
                        total = quantidade * 9.9;
                    System.out.printf("Você deve pagar o total de: %.2f do %s%n" , total , p2);
                    break;
                case "A003":
                    System.out.println("Informe a quantidade desejada:");
                        quantidade = e.nextDouble();   
                        total = quantidade * 14.0;
                    System.out.printf("O valor final ficou: %.2f de %s%n" , total, p3);
                case "A004":
                    System.err.println("Informe a quantidade desejada:");
                        quantidade = e.nextDouble();
                        total = quantidade * 19.9;
                    System.out.printf("O valor final ficou:%.2f do %s%n", total, p4);
                    break;
            default:
                System.out.println("Código inválido");
                break;
        }    

    }
}