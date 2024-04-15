import java.util.Scanner;

public class imc {
//      Você foi solicitado a criar um programa para acompanhamento de peso, no 
// qual através do peso e da altura calcula-se o IMC. Após o cálculo, deverá ser 
// informada a classificação, conforme tabela abaixo. (IMC = Peso / Altura²)
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            double imc, p, altura;
            String classificacao = "" ;
        System.out.println("informe seu peso:\n");
            p = e.nextDouble();
        System.out.println("Infomre sua altura:\n");   
            altura = e .nextDouble();
            imc = p / altura * altura ;
       if (imc <16) {
            classificacao = "magreza severa";
       }else if (imc <= 16 && imc >= 17) {
            classificacao = "magreza moderada";
       }else if (imc >=17 && imc < 18.5) {
            classificacao = "magreza leve ";



       }else if(imc >18.5 && imc < 25) {
            classificacao = "normal, ";
       } else if(imc >=25 && imc < 30) {
            classificacao = "obesidade leve " ;
       }else if (imc >= 30 && imc <40) {
            classificacao = "obesidade severa";
       } else if (imc >= 40) {
            classificacao = "obesidade morbida ";
       }
    //    classificacao = classificacao.replaceAll(",$" , "");
       System.out.println("Sua classificação ficou predefinida, como " + classificacao);
    }

}