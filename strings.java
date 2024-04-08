import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class strings {
        //manipulação de strings com datas
    public static void main(String[]args){

        String nome = "valzinha";

            LocalDate hoje = LocalDate.now();
                
            Locale brasil = new Locale("pt" , "brasil");
            String dia = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
            System.out.println(dia);
  }
}
