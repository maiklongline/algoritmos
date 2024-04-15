import java.util.Scanner;

public class creditoEspecial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo médio do cliente:");
        double saldoMedio = scanner.nextDouble();

        double valorCredito;

        // Calcula o valor do crédito com base no saldo médio
        switch ((int) saldoMedio / 200) {
            case 0:
                valorCredito = 0;
                break;
            case 1:
                valorCredito = saldoMedio * 0.20;
                break;
            case 2:
                valorCredito = saldoMedio * 0.30;
                break;
            default:
                valorCredito = saldoMedio * 0.40;
                break;
        }

        System.out.println("Saldo médio: R$" + saldoMedio);
        System.out.println("Valor do crédito: R$" + valorCredito);
    }
}

    

