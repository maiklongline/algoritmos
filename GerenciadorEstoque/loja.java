package GerenciadorEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class loja {

    static Scanner ler = new Scanner(System.in);
    static String tipo;
    static int tamanho;
    static int quantidade;


    public static void compraRack(ArrayList<Rack> estoque){
    System.out.println("Informe o tipo de rack:");
    tipo = ler.next();

           if (tipo.equals("parede")) {
        Rack.tamanhoParede();  // Exibe os tamanhos disponíveis para parede
        System.out.println("Informe o tamanho do rack de parede:");
        tamanho = ler.nextInt();
    } else if (tipo.equals("piso")) {
        Rack.tamanhoPiso();  // Exibe os tamanhos disponíveis para piso
        System.out.println("Informe o tamanho do rack de piso:");
        tamanho = ler.nextInt();
    } else {
        System.err.println("Tipo de rack inválido.");
        return;
    }

    System.out.println("Informe a quantidade de racks para comprar:");
     quantidade = ler.nextInt();

    // Verificar se o rack já está no estoque
    boolean rackExistente = false;
    for (Rack rack : estoque) {
        if (rack.getTipo().equals(tipo) && rack.getTamanho() == tamanho) {
            rack.setQuantidade(rack.getQuantidade() + quantidade);
            System.out.println("Quantidade atualizada no estoque.");
            rackExistente = true;
            break;
        }

    if (!rackExistente) {
        estoque.add(new Rack(tipo, quantidade, quantidade));
        System.out.println("Rack atualizado no estoque");
        
    }
    }
    }

    static void pesquisar(ArrayList<Rack> estoque){
        String pesquisa;
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

         pesquisa = tipo;

         // Realiza a pesquisa pelo tipo informado
    boolean rackEncontrado = false;
    for (int i = 0; i < estoque.size(); i++) {
        Rack rack = estoque.get(i);  

       
        if (rack.tipo.equalsIgnoreCase(tipo)) {
            rack.exibirRack();  
            rackEncontrado = true;
        }
    }

    if (!rackEncontrado) {
        System.out.println("Nenhum rack do tipo '" + tipo + "' foi encontrado.");
    }


    }

    public static void add(Rack rack) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
    
    
}
