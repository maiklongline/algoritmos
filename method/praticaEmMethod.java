package method;

import java.util.Scanner;

public class praticaEmMethod {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // formasNumeros(leia);
        // parImpar(leia);
        // calcuSimples(leia);
        // testNeps();
        // desenhandoFormasQuadrado(leia);
        // dessenhandoTriangulo(leia);
        // notaLimite(leia);
        // pedindoSenha(leia);
        // infoValidacao(leia);
        populacao(leia);
        populacaoAlterar(leia);
    }

    static void formasNumeros(Scanner leia) {

        System.out.println("Informe um número");
        int num = leia.nextInt();

        if (num > 0) {
            System.out.println("número positivo");

        } else if (num < 0) {
            System.out.println("número negativo");
        } else {
            System.out.println("NEUTRO");
        }

    }

    static void parImpar(Scanner leia) {
        System.out.println("Informe um número para saber se é par ou ímpar");
        int num = leia.nextInt();
        if (num % 2 == 0)
            System.out.println("par");
        else
            System.out.println("impar");
    }

    static void calcuSimples(Scanner leia) {
        int operacao;
        System.out.println("escolha sua operação");
        System.out.println("1 soma");
        System.out.println("2 subtração");
        System.out.println("3 multiplicação");

        System.out.println("Informe dois números para a operação");
        System.out.println("primeiro número");
        int num1 = leia.nextInt();
        System.out.println("primeiro número");
        int num2 = leia.nextInt();
        int result = 0;

        operacao = leia.nextInt();
        switch (operacao) {
            case 1:
                result = num1 + num2;

                break;
            case 2:
                result = num1 - num2;

                break;
            case 3:
                result = num1 * num2;

                break;
            default:
                System.out.println("operação inválida");
        }
        System.out.println(result);
    }

    static void testNeps() {
        double nota1 = 10;
        double nota2 = 9.8;

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void desenhandoFormasQuadrado(Scanner leia) {
        System.out.println("Informe o tamanho");
        int tamanho = leia.nextInt();
        for (int linhas = 1; linhas <= tamanho; linhas++) {
            System.out.println();
            for (int colunas = 1; colunas <= tamanho; colunas++) {
                System.out.print("* ");
            }

        }
        System.out.println();
    }

    static void dessenhandoTriangulo(Scanner leia) {
        System.out.println("Informe o número de linhas");
        int linhas = leia.nextInt();
        for (int i = 1; i <= linhas; i++) {
            System.out.println();
            for (int j = 1; j <= linhas; j++) {
                System.out.print("* ");
            }
        }
    }

    static void notaLimite(Scanner leia) {
        int nota;
        do {
            System.out.println("Informe uma nota de 0 a 10");
            nota = leia.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("informe um número válido " + nota);
            }
        } while (nota < 0 || nota > 10);
        System.out.println("sua nota:" + nota);
    }

    static void pedindoSenha(Scanner leia) { //executa uma função~
         

        String nomeUs, senha;
        boolean info = false;
        do {
            System.out.println("insira o nome do usuario");
            nomeUs = leia.next();

            System.out.println("Insira a senha:");
            senha = leia.next();

            if (nomeUs.equalsIgnoreCase(senha)) {
                System.out.println("nome de usurio é senha");
                info = false;
            } else {
                info = true;
                System.out.println("senha e usuarios validos");
            }
            /*
             * neste while irá continuar execuntando até que a condição se torne verdadeira
             *  como foi atribuido antes que info fosse false, só ira mudar quando tornar
             * verdadeira
             */
        } while (!info);
    }

    static void infoValidacao(Scanner leia) {
        String nome, sexo, estadoCivil;
        int idade, salario;

        boolean valide = false;

        do {
            System.out.println("Informe seu nome:");
            nome = leia.next();
            if (nome.length() > 3) {
                valide = true;
            } else {
                System.out.println("Insira um nome com mais de 3 caracteres");
            }
        } while (!valide);

        valide = false;

        do {
            System.out.println("Informe uma idade:");
            idade = leia.nextInt();

            if (idade > 0 && idade <= 150) {
                valide = true;
            } else {
                System.out.println("informe uma idade maior que 0 e menor que 150");
            }
        } while (!valide);

        valide = false;

        do {
            System.out.println("Informe o salário");
            salario = leia.nextInt();
            if (salario > 0) {
                valide = true;
            } else {
                System.out.println("informe um salário acima de 0 reais");
            }
        } while (!valide);

        valide = false;
        do {
            System.out.println("Informe seu genero");
            sexo = leia.next();
            if (sexo.equalsIgnoreCase("f") || (sexo.equalsIgnoreCase("m"))) {
                valide = true;
            } else {
                System.out.println("Informe entre 'f' ou 'm'");
            }
        } while (!valide);

        valide = false;
        do {
            System.out.println("Informe seu estado civil");
            estadoCivil = leia.next();
            if (estadoCivil.equalsIgnoreCase("s") || (estadoCivil.equalsIgnoreCase("c"))
                    || (estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))) {
                valide = true;
            } else {
                System.out.println("Informe um ESTADO CIVIL: EX. S-solteiro");
            }
        } while (!valide);

        System.out.println("nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Salário:" + salario);
        System.out.println("Sexo:" + sexo);
        System.out.println("Estado Civil:" + estadoCivil);
    }

    static void populacao(Scanner leia){
        int popA = 8000;
        int popB= 20000;
       int contador = 0;
        while (popA <= popB) {
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            contador++;
        }
        System.out.println("população a: " +popA);    
        System.out.println("população b: " +popB);
        System.out.println("quantidade:" + contador);    
    }

    static void populacaoAlterar(Scanner leia){
        int popA , popB;
        double taxaPopA , taxaPopB;
        int cont = 0;
        boolean valido=false;

         System.out.println("Informe a qunatidade da população A: ");
        popA = leia.nextInt();
        System.out.println("Informe a qunatidade da população B: ");
        popB = leia.nextInt();
        

        System.out.println("informe as taxas de crescimento da população A:");
        taxaPopA = leia.nextDouble();
        System.out.println("informe as taxas de crescimento da população B:");
        taxaPopB = leia.nextDouble();

        while (popA >= popB) {
            popA += (popA/100) * taxaPopA;
            popB += (popB/100) * taxaPopB;
            cont++;
        }

        System.out.println("população a: " +popA);    
        System.out.println("população b: " +popB);
        System.out.println("quantidade:" + cont);  

}
}
