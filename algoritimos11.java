

import java.util.Scanner;

public class algoritimos11 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
			double nota1, nota2, nota3,notar,nv = 0, media;
			String result ="";
		System.out.println("Insira a primeira nota do aluno");
			nota1 = e.nextDouble();
		System.out.println("Insira a primeira nota do aluno");
			nota2 = e.nextDouble();
		System.out.println("Insira a primeira nota do aluno");
			nota3 = e.nextDouble();
			media = (nota1 + nota2 + nota3)/3;
		if(media >= 6){
			result = "aprovado";
		}else if (media <5) {
			result = "reprovado";
			
		}else if(media >5 && media <6) {
			result = "recuperação";
		System.out.println("Inserir a nova nota de recuperação");
				notar = e.nextDouble();
			 nv = (media + notar)/2;
		}if (nv >= 6) {
			result = "Aluno aprovado na recuperação";
		}else{
			result = "Aluno reprovado na recuperação";
		}
		
		System.out.printf("nota: %05.2f e %s " , media, result);
		
		
	}
}
