package method;

import java.util.Scanner;

public class praticandoIfElse {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // maiorMenor(leia);
        // positivoNegativo(leia);
        // verificacaoLetra(leia);
        // vogalConsoante(leia);
        // notasParciais(leia);
        // numerosMaior(leia);
        // precoProdutos(leia);
        // ordemDescrescente(leia);
        // seuTurno(leia);
        // aumentoTabajara(leia);
        // impostoRenda(leia);
        // notasConceitos(leia);
        // qualTriângulo(leia);
        // equacaoSengundoGrau(leia);
        // anoBissexto(leia);
        postoGasolina(leia);

    }

    static void maiorMenor(Scanner leia) {
        System.out.println("Informe um número");
        int num1 = leia.nextInt();
        System.out.println("Informe um número");
        int num2 = leia.nextInt();

        // analise de número maior se é ou não o primeiro pedido, verdade
        if (num1 > num2) {
            System.out.println("maior: numero1 =" + num1);
        } else if (num2 > num1) {
            System.out.println("maior: numero2 =" + num2);
        } else {
            System.out.println("São iguais");
        }

    }

    static void positivoNegativo(Scanner leia) {
        System.out.println("primeiro número");
        int num1 = leia.nextInt();

        if (num1 > 0) {
            System.out.println("números positivos");
        } else if (num1 < 0) {
            System.out.println("números negativos");
        } else {
            System.out.println("Igual a zero");
        }

    }

    static void verificacaoLetra(Scanner leia) {
        System.out.println("Informe a letra");
        String letra = leia.nextLine();

        // switch (letra) {
        // case "F", "f":
        // System.out.println("Feminino");
        // break;
        // case "M" , "m":
        // System.out.println("Masculino");
        // break;
        // default:
        // System.out.println("Sexo inválido");
        // break;
        // }
        if (letra.equalsIgnoreCase("f")) {
            System.out.println("f- feminino");
        } else if (letra.equalsIgnoreCase("m")) {
            System.out.println("m- masculino");
        } else {
            System.out.println("sexo invalido");
        }

    }

    static void vogalConsoante(Scanner leia) {
        System.out.println("Infome a vogal");
        String letra = leia.nextLine();

        if (letra.length() > 1) {
            System.out.println("inválido");
        } else {

            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("uma vogal");
                    break;

                default:
                    System.out.println("consoantes");
                    break;
            }
        }
    }

    static void notasParciais(Scanner leia) {
        System.out.println("Informe a primeira nota");
        double nota1 = leia.nextInt();
        System.out.println("Informe a segunda nota");
        double nota2 = leia.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Reprovado: " + media);
        }

    }

    static void numerosMaior(Scanner leia) {
        System.out.println("Informe três números");
        int num1 = leia.nextInt();
        int num2 = leia.nextInt();
        int num3 = leia.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("o maior é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("o mairo é: " + num2);
        } else {
            System.out.println("o maior é: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("o menor é: " + num2);
        } else {
            System.out.println("o menor é: " + num3);
        }
    }

    static void precoProdutos(Scanner leia) {
        System.out.println("Informe os preços dos 3 produtos");
        double preco1 = leia.nextDouble();
        double preco2 = leia.nextDouble();
        double preco3 = leia.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("compre o produto1");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("compre o produto 2");
        } else if (preco3 <= preco2 && preco3 <= preco1) {
            System.out.println("compre o produto 3");
        }
    }

    static void ordemDescrescente(Scanner leia) {
        System.out.println("informe três números");
        int num1 = leia.nextInt();
        int num2 = leia.nextInt();
        int num3 = leia.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            // numero1 menor
            // numero3 maior
            System.out.println(num3 + "-" + num2 + "-" + num1);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            // numero1 menor
            // numero2 maior
            System.out.println(num2 + "-" + num3 + "-" + num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            // numero2 menor
            // numero3 maior
            System.out.println(num3 + "-" + num1 + "-" + num2);
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            // numero2 menor
            // numero1 maior
            System.out.println(num1 + "-" + num3 + "-" + num2);
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            // numero3 menor
            // numero2 maior
            System.out.println(num2 + "-" + num1 + "-" + num3);
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
            // numero3 menor
            // numero1 maior
            System.out.println(num1 + "-" + num2 + "-" + num3);
        }
    }

    static void seuTurno(Scanner leia) {
        System.out.println("Informe seu turno da escola");
        System.out.println("M - matutino");
        System.out.println("V - vespertino");
        System.out.println("N - noturno");
        String turno = leia.nextLine();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom dia!!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!!");
        }
    }

    public static void aumentoTabajara(Scanner leia) {
        double salario, novoSalario = 0, aumento, percentual;
        System.out.println("Informe seu salário");
        salario = leia.nextDouble();

        if (salario <= 280.0) {
            percentual = 20;
        } else if (salario > 280.0 && salario <= 700.0) {
            percentual = 15;
        } else if (salario >= 700.0 && salario < 1500.0) {
            percentual = 10;
        } else {
            percentual = 5;
        }
        aumento = (salario / 100) * percentual;
        novoSalario = salario + aumento;
        System.out.println("salario antes do reajuste: " + salario);
        System.out.println("percentual do salário: " + percentual);
        System.out.println("aumento: " + aumento);
        System.out.println("salario novo " + novoSalario);

    }

    static void impostoRenda(Scanner leia) {
        double hora, horasMes, salario, desconto, salarioLiquido;
        System.out.println("informe o valor da hora");
        hora = leia.nextDouble();
        System.out.println("informe informe suas horas trabalhadas");
        horasMes = leia.nextDouble();

        salario = hora * horasMes;
        double descontoIr = 0;
        if (salario <= 900) {
            descontoIr = 0;
        } else if (salario > 900 && salario <= 1500) {
            descontoIr = 5;
        } else if (salario > 1500 && salario < 2500) {
            descontoIr = 15;
        } else if (salario >= 2500) {
            descontoIr = 20;
        }

        // atribuir a conversão de salario para a porcentagem correta,
        // após a conversão ha multiplicação do do resultado
        double ir = (salario / 100) * descontoIr;
        double inss = (salario / 100) * 10;
        double fgts = (salario / 100) * 11;
        desconto = ir + inss;
        salarioLiquido = salario - desconto;

        System.out.println("salário bruto (" + hora + "*" + horasMes + "");
        System.out.println("Ir (" + descontoIr + ")" + ir);
        System.out.println("inss(10%)" + inss);
        System.out.println("fgts(11%)" + fgts);
        System.out.println("total de descontos" + desconto);
        System.out.println("salario liquído: " + salarioLiquido);
    }

    static void diaSemana(Scanner leia) {
        System.out.println("Informe o número da semana que deseja:");
        System.out.println("1 - para domingo");
        System.out.println("2 - para segunda");
        System.out.println("3 - para terça");
        System.out.println("4 - para quarta");
        System.out.println("5 - para quinta");
        System.out.println("6 - para sexta");
        System.out.println("7 - para sábado");

        int dia = leia.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");

                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("dia inválido");
                break;
        }
    }

    static void notasConceitos(Scanner leia) {
        System.out.println("primeira nota do aluno");
        double nota1 = leia.nextDouble();
        System.out.println("segunda nota do aluno");
        double nota2 = leia.nextDouble();

        String conceito;
        double media = (nota1 + nota2) / 2;

        if (media >= 9.0 && media <= 10) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media <= 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        switch (conceito) {
            case "A":
                System.out.printf(
                        "Você foi aprovado, baseado no conceito %s%n suas notas foram %.2f e %.2f%n com a média %.2f%n",
                        conceito, nota1, nota2, media);
                break;
            case "B":
                System.out.printf(
                        "Você foi aprovado, baseado no conceito %s%n suas notas foram %.2f e %.2f%n com a média %.2f%n",
                        conceito, nota1, nota2, media);
                break;
            case "C":
                System.out.printf(
                        "Você foi aprovado, baseado no conceito %s%n suas notas foram %.2f e %2.f%n com a média %2.f%n",
                        conceito, nota1, nota2, media);
                break;
            case "D":
                System.out.printf(
                        "Você foi reprovado, baseado no conceito %s%n suas notas foram %.2f e %2.f%n com a média %2.f%n",
                        conceito, nota1, nota2, media);
                break;
            case "E":
                System.out.printf(
                        "Você foi reprovado, baseado no conceito %s%n suas notas foram %.2f e %2.f%n com a média %2.f%n",
                        conceito, nota1, nota2, media);

                break;
            default:
                System.out.println("Foi além");
                break;
        }
    }

    public static void qualTriângulo(Scanner leia) {
        System.out.println("Informe o valor do lado triângulo");
        int a = leia.nextInt();
        System.out.println("Informe o valor do lado triângulo");
        int b = leia.nextInt();
        System.out.println("Informe o valor do lado triângulo");
        int c = leia.nextInt();

        if (((a + b) > c) || ((a + c) > b) || ((b + c)> a)) {
            System.out.println("é um triângulo");
            if (a == b && a == c && b == c) {
                System.out.println("triângulo equilatero");
            } else if (a != b && a != c && b != c) {
                System.out.println("Triangulo escaleno");
            }else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isosceles");
            }
        } else {
            System.out.println("não é um triângulo");
        }
    }

    static void equacaoSengundoGrau(Scanner leia) {
        System.out.println("Vamos fazer uma equação de segundo grau:");
        System.out.println("Informe o valor de a");
        double a = leia.nextDouble();

        if (a == 0) {
            System.out.println("a equação não é de segundo grau");
        } else if(a != 0){
            System.out.println("Informe o valor de b");
            double b = leia.nextDouble();
            System.out.println("Informe o valor de c");
            double c = leia.nextDouble();

            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                System.out.println("o delta não possui raizes reais");
            } else if (delta > 0) {
                System.out.println("possui duas raízes reais");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("As raízes reais são numerador x1: " + raiz1 + "\n e x2: " + raiz2);
            } else {
                System.out.println("possui apenas uma raiz real: " + delta);

            }
        }
    }
    static void anoBissexto(Scanner leia){
        System.out.println("Informe o ano correspondente");
            int ano = leia.nextInt();
        
            if(ano / 4 != 0){
                System.out.println("ano bissexto");
            }else{
                System.out.println("ano comum");
            }
    }
    static void casoMorte(Scanner leia){
        System.out.println("telefonou para a vitima?");
        String resp1 = leia.next();
        System.out.println("esteve no local do crime?");
        String resp2 = leia.next();
        System.out.println("Mora perto da vítima?");
        String resp3 = leia.next();
        System.out.println("Já trabalhou com a vitima?");
        String resp4 = leia.next();
        System.out.println("Devia a vitima?");
        String resp5 = leia.next();

        int contador=0;
        if (resp1.equalsIgnoreCase("s")) {
            contador++;    
        }
        if (resp2.equalsIgnoreCase("s")) {
            contador++; 
        }
        if (resp3.equalsIgnoreCase("s")) {
            contador++;
        }
        if (resp4.equalsIgnoreCase("s")) {
            contador++;  
        }
        if (resp5.equalsIgnoreCase("s")) {
            contador++;  
        }


        if (contador == 2) {
            System.out.println("Suspeita");
        }else if (contador == 3 && contador == 4) {
            System.out.println("cúmplice");
        }else if(contador == 5){
            System.out.println("Assasino");
        }else if(contador == 0){
            System.out.println("Inocente");
        }
    }
    static void postoGasolina(Scanner leia){
        System.out.println("informe a quantidade de litros");
        int litros = leia.nextInt();


        System.out.println("Tipo de combústivel");
        String tipo = leia.next();
        // String tipo = leia.nextLine();

        double gasolina = 2.5;
        double alcool = 1.9;
        double totalLitros = 0;
        double totalDesconto = 0;

        double perDesconto = 0;

        // leitura da String
        if(tipo.equalsIgnoreCase("a")){
            if(litros <= 20){
                // utilizando percentual desconto
                perDesconto = 3;
            }else{
                perDesconto = 5;
            }

            totalLitros = litros * alcool;

        }else if(tipo.equalsIgnoreCase("g")){
            if (litros <= 20) {
                perDesconto = 4;
            }else{
                perDesconto = 6;
            }
            totalLitros = litros * gasolina;
        }

        // atribuindo o valor da porcentagem atráves dos valores de perDesconto, como porcentagem limite é 100;
        totalDesconto = (totalLitros /100) * perDesconto;
        double geralPagar = totalLitros - totalDesconto;

        System.out.println("Preço a pagar: " + geralPagar);
        
    }
}
