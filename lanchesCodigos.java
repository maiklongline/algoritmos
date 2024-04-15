import java.util.*;
public class lanchesCodigos {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Escolha seu lanche pelo código:\n");
        System.out.println(" 100 - \nCachorro quente");
        System.out.println(" 101 - \nBauru simples");
        System.out.println(" 102 - \nBauru com ovo");
        System.out.println(" 103 - \nHambúrger");
        System.out.println(" 104 - \nCheeseburguer");
        System.out.println(" 105 - \nRefrigerante");
        int codigo = e.nextInt();
        double quantidade;
        int tt;
        switch (codigo) {
            case 100:
                System.out.println("Informe a quantidade:");
                 quantidade = e.nextDouble();
                 quantidade *= 1.20;
                System.out.printf("total: %.2f%n", quantidade);
                break;
            case 101:
                System.out.println("Informe a quantidade:");
                    quantidade = e.nextDouble();
                    quantidade *= 1.30;
                    System.out.printf("total: %.2f%n", quantidade);
                    break;
            case 102:
                System.out.println("Informe a quantidade:");
                    quantidade = e.nextDouble();
                    quantidade *= 1.50;
                    System.out.printf("total: %.2f%n", quantidade);
                break;
            case 103:
                System.out.println("Informe a quantidade:");
                    quantidade = e.nextDouble();
                    quantidade *= 1.20;
                    System.out.printf("total: %.2f%n", quantidade);
                break;
            case 104:
                System.out.println("Informe a quantidade:");
                    quantidade = e.nextDouble();
                    quantidade *= 1.30;
                    System.out.printf("total: %.2f%n", quantidade);
                break;
            case 105:
                System.out.println("Informe a quantidade:");
                    quantidade = e.nextDouble();
                    quantidade *= 1.00;
                    System.out.printf("total: %.2f%n", quantidade);
                break;
            default:
                System.out.println("Valor incorreto");
                break;
        }
    
        

    }
}
