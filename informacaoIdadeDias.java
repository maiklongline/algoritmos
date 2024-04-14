import java.util.Scanner;

public class informacaoIdadeDias {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            int resto, idadeFinal, meses, diasRestantes;
            System.out.println("Informe sua idade em dias");
                int dias = e.nextInt();
            idadeFinal = dias / 365;
            meses = (dias % 365) / 30;
            diasRestantes = (dias % 365 ) % 30;

            System.out.println("resultou em "+idadeFinal+", "+meses+" e "+diasRestantes+"");
            
    }
}
