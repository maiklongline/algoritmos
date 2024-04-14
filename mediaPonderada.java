import java.util.Scanner;

public class mediaPonderada {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            System.out.println("Informe o código do aluno");
                int codigo = e.nextInt();
            System.out.println("Informe a primeira nota");
                int nota1 = e.nextInt();
            System.out.println("Informe a segunda nota");
                int nota2 = e.nextInt();
            System.out.println("Informe a terceira nota");
                int nota3 = e.nextInt();
            int maior = nota1;//de primeira atribuimos se que valor maior é "nota1"
        if (nota1 > maior){
            maior = nota2; // aqui se for verdade a posição de maior nota muda "nota2"
        }else if (nota3 > maior) {
            maior = nota3;
        }
        //Definindo os pesos das notas
            int pesoMaior = 4;
            int pesoBase = 3;
            
            int valor1 = (nota1 == maior) ? pesoMaior : pesoBase;
            int valor2 = (nota2 == maior) ? pesoMaior : pesoBase;
            int valor3 = (nota3 == maior) ? pesoMaior : pesoBase;
       
        int media = (nota1 *valor1 + nota2 * valor2 + nota3 * valor3)/(pesoMaior+pesoBase * 2);
        //multiplica por 2, já que são duas notas que possui o mesmo peso
        if (media > 5) {
         System.out.printf("o aluno cujo codigo %d obteve as notas:%n 1°%d%n 2°%d%n 3°%d%n sua media final ficou %d%n APROVADO%n", codigo, nota1, nota2, nota3, media);
        }else{
        System.out.printf("o aluno cujo codigo %d obteve as notas:%n 1°%d%n 2°%d%n 3°%d%n sua media final ficou %d%n REPROVADO%n", codigo, nota1, nota2, nota3, media);

        }
    }
}
