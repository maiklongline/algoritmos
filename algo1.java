import java.util.*;
// Crie um algoritmo que receba três notas e seus respectivos pesos, calcule e
// mostre a média ponderada entre elas.

public class algo1 {
	

	public static void main(String[] args) {
		Scanner notas=new Scanner(System.in);
		int n1,n2,n3, p1,p2,p3;
		double media;
		System.out.println("Insira as notas");
		n1=notas.nextInt();
		n2=notas.nextInt();
		n3=notas.nextInt();
		System.out.println("insira os pesos");
		p1=notas.nextInt();
		p2=notas.nextInt();
		p3=notas.nextInt();
		media=(n1*p1 +n2+p2 + n3*p3) / (p1+p2+p3);
		System.out.println("o resultado final é\n" + media);

		


		

	}

}
