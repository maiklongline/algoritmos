import java.util.Scanner;

public class algo2 {

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
