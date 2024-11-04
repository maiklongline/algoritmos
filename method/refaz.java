package method;

public class refaz {
    public static void main(String[] args) {
 
    String palavra = " SOCORRAM Me SUBINOONIBUSemMARROCOS";
    palavra = palavra.toUpperCase();

    String retornoPalavra="";
        String [] recorte =palavra.split(" ");
    
    for(int i = recorte.length -1; i > 0; i--){
            retornoPalavra += " " + recorte[i];
    }
    System.out.println(retornoPalavra);

    retornoPalavra ="";
    for(int i = palavra.length() -1; i > 0 ; i--){

        if (i >= 0 && i < palavra.length()) { //estabelecer uma comdiçao se a palavra encontraria o indice menor que 0
        
        retornoPalavra += palavra.charAt(i);// adiciona um caracte
         System.out.println(retornoPalavra.trim());
        }
    }

}
}
