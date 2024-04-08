import java.util.Scanner;

public class algoritimos3 {
//     Crie um algoritmo que leia o nome do aluno, suas 4 notas, calcule a média e 
// classifique o resultado conforme a tabela abaixo. Ao final, deverão ser 
// exibidos o nome do aluno, suas 4 notas, sua média e sua classificação.
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            double  nota1 , nota2, nota3, nota4, media;
            String nome ;
             String classificacao = "1";
            

            System.out.print("Informe seu nome: ");
            nome = e.nextLine();
            System.out.print("Informe a primeira nota: ");
                nota1 = e.nextDouble();
            System.out.print("Segunda nota: ");
                nota2 = e.nextDouble();
            System.out.print("terceira nota: ");
                nota3 = e.nextDouble();
            System.out.print("Quarta nota: ");
            nota4 = e.nextDouble();
            media = (nota1 + nota2 + nota3 + nota4) /4 ;
                
            if (media < 20) {
                classificacao = "pessimo";
            }else if (media > 20 && media < 40) {
                classificacao = "ruim";
            }else if (media > 40 && media < 60) {
                classificacao = "regular";
            }else if (media > 60 && media < 80) {
                classificacao = "bom";
            }else if(media > 80) {
                classificacao = "ótimo";  
            }
           
          System.out.printf(" O aluno %s tirou as notas: %nn1:%05.2f%nn2:%05.2f%nn3:%05.2f%nn4:%05.2f%n média: %05.2f%n sua classificação foi: %s%n" , 
				nome,nota1,nota2,nota3,nota4,media,classificacao);
           
                    
              
    }
}
