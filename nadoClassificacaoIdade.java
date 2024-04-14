import java.util.Scanner;

public class nadoClassificacaoIdade {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe sua idade");
            int idade = e.nextInt();
            String classificacao;
        if (idade > 5 && idade < 7) {
            classificacao = "Infatil A";
        }else if (idade > 8 && idade < 10) {
            classificacao = "Infatil B";
        }else if (idade > 11 && idade < 13) {
            classificacao = "Juvenil A";
        }else if (idade > 14 && idade < 17) {
            classificacao = "Juvenil B";
        }else if (idade > 18) {
            classificacao = "ADULTO";
        }else{
          classificacao = "Não se encaixa";  
        }

        System.out.println("baseado na sua idade de "+idade+" sua classe definidada ficou "+classificacao+"");
    }
}