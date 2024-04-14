import java.util.Scanner;

public class acrescentoSalarial {
// Crie um algoritmo que receba o nome e o salário de um funcionário. Após
// isso, calcule seu novo salário sabendo que ele recebeu um aumento de 25%
// e mostre uma frase com o nome, o valor do aumento e o novo salário.
	public static void main(String[] args) {
		Scanner e=new Scanner(System.in);
			String nome;
			double salarioAtual,salarioNovo;
			System.out.println("Digite o nome do funcionário");
				nome = e.next();
			System.out.println("Digite o valor do sálario");
				salarioAtual = e.nextDouble();
				salarioNovo = salarioAtual * 1.25;
			System.out.println("O novo salário é:\n" + salarioNovo);

	}

}
