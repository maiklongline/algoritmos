package GerenciadorEstoque;
import java.util.*;

import java.io.*;
import java.util.ArrayList;

class gerenciamentoRack
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner ler = new Scanner(System.in);
        ArrayList <Rack> estoque = new ArrayList <Rack> ();
        estoque.add(new Rack("parede" , 5, 12));
        estoque.add(new Rack("parede", 7 , 3));
        estoque.add(new Rack("piso", 24 , 5));
        estoque.add(new Rack("piso" , 36 , 3));
        // mostrar o arrayList  
        for(int i = 0 ; i <= estoque.size(); i++){
           estoque.get(i).exibirRack();
        }
        boolean executar = false;
        int opcao;

        while (!executar) {
            iniciarMenu();
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    adicionarRack(ler);
                    break;
                case 2:
                     System.out.println("oija");
                    // exibirEstoque();
                    break;
                case 3:
                     System.out.println("oila");
                    // removerRack();
                    break;
                case 4:
                    System.out.println("saindo do sistema...");
                default:
                    System.out.println("Opção invalida");
            }

        }

    }

    static void iniciarMenu(){
    System.out.println("Gerenciar Estoque:\n Escolha");
    System.out.println("1 . Adicionar Rack");
    System.out.println("2 . Exibir racks disponíves");
    System.out.println("3 . Remover rack");
    System.out.println("4 . Sair do sistema");
}

    static void adicionarRack(Scanner ler){
        System.out.println("Informe o tipo do rack:");
         String tipo = ler.next();

         if (tipo.equals("parede")) {
            Rack.tamanhoParede();
         }else if(tipo.equals("piso")){
            Rack.tamanhoPiso();
         }else{
            System.out.println("Tipo invalido");
            return;
         }
        System.out.println("Informe o tamanho: ");
        int tamanho = ler.nextInt();
        System.out.println("Informe a quantidade de racks: ");
        int quantidade = ler.nextInt();

        estoque.add(new Rack(tipo , tamanho , quantidade));
         System.out.println("Rack adiconado com sucesso");
    }

    
}