 package GerenciadorEstoque;

class Rack {

    String tipo;
    int tamanho;
    int quantidade;

    public Rack(String tipo , int tamanho , int quantidade){
        this.tipo = tipo;
        this.tamanho = tamanho;
        this. quantidade = quantidade;
    }

    static void tamanhoParede(){
        int tamanho = 20;
        System.out.println("Tamanhos disponiveis para rack de parede:");
        for(int i = 3; i <= tamanho; i +=2){
            System.out.println("tamanho: " + i);
        }
    }

   
    static void tamanhoPiso(){
        int tamanho = 48;
        System.out.println("Tamanhos disponiveis para rack de piso:");
        for(int i = 12; i < tamanho; i +=4){
            System.out.println("tamanho: " + i);
        } 
    }

    void exibirRack(){
        if(tipo.equals("parede")){
            System.out.println("Tipo: " +tipo+  "tamanho: " +tamanho+  "quantidade: "  +quantidade);
        }else if(tipo.equals("piso")){
            System.out.println("Tipo:" +tipo+ "Tamanho: " +tamanho+ "quantidade: " +quantidade);
        }
    }
}