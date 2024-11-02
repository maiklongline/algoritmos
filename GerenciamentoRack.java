import java.util.*;
import java.lang.*;
import java.io.*;
import java.ArrayList;

class gerenciamentoRack
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner ler = new Scanner(System.in);
        ArrayList < rack > estoque = new ArrayList < rack > ();

        boolean executar = false;
        int opcao;

        while (!executar) {
            iniciarMenu(ler)
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("oi");
                    // adicionarRack();
                    break;

                case 2:
                     System.out.println("oi");
                    // exibirEstoque();
                    break;

                case 3:
                     System.out.println("oi");
                    // removerRack();
                    break;

                case 4:
                    System.out.println("saindo do sistema...");

                default:
                    System.out.println("Opção invalida");
            }

        }

    }

    static void iniciarMenu(Scanner ler);
    System.out.println("Gerenciar Estoque:\n Escolha");
    System.out.println("1 . Adicionar Rack");
    System.out.println("2 . Exibir racks disponíves");
    System.out.println("3 . Remover rack");
    System.out.println("4 . Sair do sistema");
}