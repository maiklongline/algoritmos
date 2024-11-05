package GerenciadorEstoque;
import java.util.*;

import java.io.*;
import java.util.ArrayList;

class gerenciamentoRack
{
   static Scanner ler = new Scanner(System.in);
     static ArrayList <Rack> estoque = new ArrayList <Rack>(); 
    public static void main(String[] args) throws java.lang.Exception
    {
        
         
        estoque.add(new Rack("parede" , 5, 12));
        estoque.add(new Rack("parede", 7 , 3));
        estoque.add(new Rack("piso", 24 , 5));
        estoque.add(new Rack("piso" , 36 , 3));
        
        // mostrar o arrayList  
       
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
                     
                    exibirEstoque(ler);
                    break;
                case 3:
                    removerRack(ler);
                    break;
                case 4:
                loja.pesquisar(estoque);
                break;
                case 5:
                loja.compraRack(estoque);

                case 6:
                    System.out.println("saindo do sistema...");
                    executar = true;
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }

    }
//metodo para perguntar ao usuario o que deseja
    static void iniciarMenu(){
    System.out.println("Gerenciar Estoque:\nEscolha");
    System.out.println("1 . Adicionar Rack");
    System.out.println("2 . Exibir racks disponíves");
    System.out.println("3 . Remover rack");
    System.err.println("4. pesquisar rack");
    System.out.println("5. compra de rack");
    System.out.println("6 . Sair do sistema");
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

    static void exibirEstoque(Scanner ler){
        int i = 0;
       
        if(estoque.isEmpty()){
             System.out.println("estoque vazio");
        }else{
            System.out.println("Racks disponíveis: ");
            for( i = 0 ; i < estoque.size(); i++){
                estoque.get(i).exibirRack();
            }
        }
    }

    static void removerRack(Scanner ler){
        System.out.println("Racks no estoque:");
        for (int i = 0; i < estoque.size(); i++){
            estoque.get(i).exibirRack();
        }
        
        System.out.println("informe o tipo de rack para remoção:");
        String tipo = ler.next();
        if (tipo.equals("parede")) {
            Rack.tamanhoParede();
        }else if(tipo.equals("piso")){
            Rack.tamanhoPiso();
          
        }else{
            System.err.println("rack invalido");
            return;
        }
        System.out.println("Informe o tamanho do rack");
        int tamanho = ler.nextInt();
        System.out.println("Informe a quantidade do rack");
        int quantidade = ler.nextInt();

         boolean removido = false;
    for (int i = 0; i < estoque.size(); i++) {
        Rack rack = estoque.get(i);
        // Verifica se o rack corresponde aos critérios para remoção
        if (rack.tipo.equals(tipo) && rack.tamanho == tamanho && rack.quantidade == quantidade) {
            estoque.remove(i);  // Remove o rack encontrado
            System.out.println("Rack removido com sucesso.");
            removido = true;
            break;  // Interrompe o loop após a remoção
        }
    }

    // Mensagem caso o rack não seja encontrado
    if (!removido) {
        System.out.println("Rack não encontrado.");
    }
}

    

}
