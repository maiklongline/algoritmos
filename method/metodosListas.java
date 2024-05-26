package method;

import java.text.DecimalFormat;
import java.util.*;

public class metodosListas {

	public static void main(String[] args) {
		// divisores();
		// multiplos10();
		// somaValores();
		// complementoValores();
		// somaSequencia();
		// complementoSequencia();
		// aumentoSalarial();
		// salarioEmDois();
		// positivosNegativos();
		// notaAluno();
		// menuDadosValor();
		// valoresSeries();
		// campeonatoDe5();
		leituraDeNumeros();
		valores15();
	}

	public static void divisores() {
		int i;
		for (i = 50; i < 9500; i++) {
			if (i % 3 == 0) {

				System.out.println("final:" + i);

			}
		}
	}

	public static void multiplos10() {
		int i, j;
		for (i = 1; i < 250; i++) {
			System.out.println(i);
			if (i % 10 == 0) {
				System.out.println("é multiplo de 10:" + i);
			}
		}
	}

	public static void somaValores() {
		int i, soma = 0;
		for (i = 1; i <= 100; i++) {
			soma += i;
		}

		System.out.println("A soma dos número de 1 a 100: " + soma);
	}

	public static void complementoValores() {
		Scanner e = new Scanner(System.in);
		System.out.println("Defina um número limite");
		int j = e.nextInt();
		int i, soma = 0;
		for (i = 1; i <= j; i++) {
			soma += i;
		}
		System.out.printf("A soma dos números de 1 a %d resultaram em %d%n", j, soma);

	}

	public static void somaSequencia() {
		int soma = 0;
		int i;
		int termo = 5;
		for (i = 1; i <= 15; i++) {
			soma += termo;
		}

		System.out.println("valor:" + soma);
	}

	public static void complementoSequencia() {
		int soma = 0;
		Scanner e = new Scanner(System.in);
		System.out.println("Infome o número inicial");
		int termo = e.nextInt();
		System.out.println("informe o ultimo número");
		int j = e.nextInt();
		for (int i = 1; i <= j; i++) {

			soma += termo;
		}
		System.out.println("valor:" + soma);
	}

	public static void aumentoSalarial() {
		double salario = 1000;
		double aumento = 1.5 / 100;
		int ano;
		for (ano = 2011; ano <= 2024; ano++) {
			if (ano >= 2012) {
				aumento *= 2;
			}

			salario += salario * aumento;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		String salarioF = df.format(salario);

		System.out.printf("O salario atual do funcionário é R$%s%n", salarioF);
	}

	public static void salarioEmDois() {
		Scanner e = new Scanner(System.in);
		System.out.println("Informe o salário de carlos em reais");
		double salarioCarlos = e.nextInt();
		

		double salarioJoao = salarioCarlos / 3;

		double rendeCarlos= 0.2;
		double rendeJoao= 0.5;

		int meses = 0;

		while(salarioJoao<=salarioCarlos){
			salarioCarlos+=salarioCarlos * rendeCarlos;
			salarioJoao+= salarioJoao * rendeJoao;
			meses++;
		}
		System.out.println("meses esquivalentes: "+meses);
		}
		
		
	

	public static void positivosNegativos() {
		int num, positivos = 0, quantidadeNegativos = 0;
		Scanner e = new Scanner(System.in);
		do {
			System.out.println("Digite um número que seja diferente de 0");
			// entrada do número que somente seja 0
			num = e.nextInt();

			if (num > 0) {
				positivos += num;
			} else if (num < 0) {
				quantidadeNegativos++;
			}
		} while (num != 0);

		System.out.println("soma dos positivos: " + positivos);
		System.out.println("quantidade de números negativos" + quantidadeNegativos);

		e.close();
	}

	public static void notaAluno() {
		Scanner e = new Scanner(System.in);
		int nota;
		do {
			System.out.println("informe a nota do aluno (0 a 10)");
			nota = e.nextInt();
			if (nota < 0 || nota > 10) {
				System.out.println("Informe uma nota válida");
			} else {
				if (nota >= 6) {
					System.out.println("O aluno está aprovado");

				} else if (nota > 5 && nota < 6) {
					System.out.println("Aluno ficou de recuperação");
				} else {
					System.out.println("Reprovado");
				}
			}
		} while (nota < 0 || nota > 10);
		e.close();

	}

	public static void menuDadosValor() {
		Scanner e = new Scanner(System.in);
		int opcao;
		double salario, imposto, salarioFinal;
		do {
			System.out.println("Escolha sua opção desejada:");
			System.out.println("1. Imposto");
			System.out.println("2. Novo salário");
			System.out.println("3. classificação");
			System.out.println("4. finalizar programa");
			opcao = e.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("informe o salário do funcionário");
					salario = e.nextDouble();
					if (salario <= 1500.0) {
						imposto = salario * 0.5; // calculo de 5% de imposto
					} else if (salario > 1500.01 && salario < 3000.0) {
						imposto = salario * 0.10;// calculo de 105 imposto
					} else {
						imposto = salario * 0.15; // calculo de 15% imposto
					}
					// atribuindo a subtração acima do imposto
					salarioFinal = salario - imposto;
					System.out.println("Seu salário é:" + salarioFinal);
					break;
				case 2:
					System.out.println("Informe seu salário:");
					salario = e.nextDouble();
					if (salario < 2000.01) {
						salario += 130.0;// acrescimo do salario atual
					} else if (salario > 2000.01 && salario < 3000) {
						salario += 150.0;
					} else if (salario > 3000.01 && salario < 4500.01) {
						salario += 200.0;
					} else {
						salario += 250.0;
					}
					System.out.println("o salario ficou definido como: " + salario);
					break;
				case 3:

					System.out.println("informe seu salário:");
					salario = e.nextDouble();
					if (salario > 3000) {
						System.out.println("Bem remunerado");
					} else {
						System.out.println("mal remunerado");
					}
					break;
				default:
					System.out.println("sua opcao esta invalida tente novamente");
					break;
			}
		} while (opcao != 4);
		e.close();
	}

	public static void valoresSeries(){
		Scanner e = new Scanner(System.in);
		System.out.println("informe o número de termos:");
		int termo = e.nextInt();

		int valor = 2;
		System.out.print("," + valor);
		int multiplicador = 1;
		for(int i = 2; i <= termo; i++){
			if (i % 2 == 0) {
				valor*=multiplicador;
				System.out.print(valor + ", ");
			}else{
				valor = valor * 3;
				multiplicador= 3;
				System.out.print(valor + ", ");
			}
		}
	}
	public static void campeonatoDe5(){
		Scanner e = new Scanner(System.in);
		int numTimes = 5, jogadoresTimes = 15;
		int totalJogadores = numTimes *jogadoresTimes;
		int jogadorMenor = 0 , somaIdades=0, somaAltura=0,jogadorPesado=0;
		
		for(int i = 1; i <=numTimes;i++){
			System.out.println("time: "+ i+ ":");
			for(int j =1; i <=jogadoresTimes;j++){
				System.out.println("jogadores " +jogadoresTimes+ ":");
				System.out.println("Idade dos jogadores:");
				int idade = e.nextInt();
				System.out.println("informe peso (em KG)");
				double peso = e.nextDouble();
				System.out.println("Altura em metros:");
				double altura = e.nextDouble();

				if (idade < 18) {
					jogadoresTimes++;				
				}
				somaIdades+=idade;
				somaAltura+=altura;
				if (peso > 80) {
					jogadorPesado++;
				}
			}

		}
		double mediaIdades = somaIdades / totalJogadores;
		double mediaAlatura = somaAltura / totalJogadores;

		double mais80kg = jogadorPesado / totalJogadores * 100;

		System.out.println("Resultados:");
		System.out.println("jogadores com idade inferior a 18 anos" + jogadorMenor);
		System.out.println("jogadores com idade" + mediaIdades);
		System.out.println("jogadores com altura" + mediaAlatura);
		System.out.println("jogadores com mais de 80 kg:" + mais80kg);

	}
	public static void leituraDeNumeros(){
		Scanner e = new Scanner(System.in);

		int valor;
		int maior = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		System.out.println("Digite os valores 0");
		while (true) {
			valor = e.nextInt();
			if(valor < 0){
				break;

			}
			if(valor > maior){
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
		}	
		System.out.println("maior valor:" + maior);
		System.out.println("menor valor: "+ menor);
	}

	public static void valores15(){
		Scanner e = new Scanner(System.in);
		double soma = 0;
		int pares = 0, diviPor5 = 0;
		System.out.println("Digite 15 valores:");
		int valor = e.nextInt();
		int menor,maior;
		menor = maior = valor;
		soma+= valor;

		for(int i = 1; i < 15; i++){
			valor = e.nextInt();
			soma+= valor;
		}
		if(valor < menor){
			menor = valor;
		}
		if(valor >maior){
			maior = valor;
		}
		if(valor % 2 == 0){
			pares++;

		}
		if(valor %5 == 0){
			diviPor5++;
		}
		double media = soma/15;

		System.out.println("menor valor: "+ menor);
		System.out.println("maior valor: "+ menor);
		System.out.println("mediaa valor: "+ media);
		System.out.println("pares: "+ pares);
		System.out.println("pares: "+ diviPor5);
	}
}