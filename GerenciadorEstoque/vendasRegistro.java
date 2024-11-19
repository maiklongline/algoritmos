

import java.util.ArrayList;
import java.util.Scanner;

class vendasRegistro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] valorVendas = new double[1000000];
        double[] numParcelas = new double[3];

        double valor;
        int parcelas;
        int cont = 0;

        while(true){
            System.out.println("informe as vendas realizadas");
            valor = ler.nextDouble();

          if (valor == 0) {
            break;
          }

           System.out.println("Infome o número de parcelas");
           parcelas = ler.nextInt();

           if (valor < 0 || parcelas < 0) {
                System.out.println("valor incorreto");
           }else{
            //preencher valores
            valorVendas[cont] = valor;
            numParcelas[cont] = parcelas;
            cont++; 

            System.out.println("resgitrado");
           }

           for(int i = 0; i < cont ; i++){
                System.out.println("valor "+valorVendas[i]+" Parcelas: "+numParcelas[i]+"");
           }
        }

        
    }
    
}