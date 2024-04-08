import java.util.Scanner;

public class algoritimos12 {
 
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
            int n1,n2,n3,n4, media;
            String classificacao;
            int aulasD , aulasF, aulasP;

            //definir com o do-while que pudesse estabelcer uma tipagem, 
            //que não saisse de números entre 0 e 100
       do {
            System.out.println("Informe a nota1 (entre 0 e 100)");
            n1 = e.nextInt();
       } while (n1 < 0 || n1 > 100);
           
       do {
        System.out.println("Informe a nota2(entre 0 e 100)");
            n2 = e.nextInt();
       } while (n2 < 0 || n2 > 100);
       do {
        System.out.println("Informe a nota3(entre 0 e 100)");
            n3 = e.nextInt();
       } while (n3 < 0 || n3 >100);
       do {
        System.out.println("Informe a nota4(entre 0 e 100)");
            n4 = e.nextInt();
       } while (n4 < 0 || n4 >100);
       media = (n1 + n2 + n3 + n4) /4;

       System.out.println("informe as aulas dadas");
        aulasD = e.nextInt();
       System.out.println("informe a quantidade de faltas");
        aulasF = e.nextInt();
       aulasP = (aulasD * aulasF) /2;

       if (media > 80 && aulasP == 0.0 ) {
            classificacao = "Seu prêmio é uma excursão";
        // neste segundo "else if" atribui que dependendo da media ou 
        //o total de presença fosse resulta em algum prêmio    
       }else if (media > 80 || aulasP == 100.0) {
            classificacao = "Seu prêmio é uma camiseta";
       }else if (media > 70 && media < 80 && aulasP == 90.0) {
            classificacao = "Seu prêmio é uma squeeze";
       }else if ((media >= 70 && media <= 80)||(aulasP <= 90.0)) {
            classificacao = "Seu prêmio é  uma caneta personalizada";
       }else{
            classificacao = "Você não recebe prêmio";
       }

       //decidi atribuir um switch-case, como forma de deixar o executar mais limpo 
       // e como forma de saber que possui outra forma de atribuir
       switch (classificacao) {
        case "Seu prêmio é uma excursão":
                System.out.println("Parabéns ganhou uma excursão");
            break;
        case "Seu prêmio é uma camiseta":
                System.out.println("Parabéns ganhou uma camiseta");
            break;
        case "Seu prêmio é uma squeeze":
                System.out.println("Parabéns ganhou uma squeeze");
            break;
        case "Seu prêmio é uma caneta personalizada":
                System.out.println("Parabéns ganhou uma caneta personalizada");
            break;
        default:
            System.out.println("Você não recebe um prêmio");
            break;
       }
    //    System.out.println("Seu sua média "+media+" resultou em "+classificacao+"");
       
       
            
        

}
}