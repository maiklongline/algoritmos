import java.util.Scanner;

public class horaeTempoJogo {

    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        System.out.println("Informe a hora de inicio e seus minutos (separadamente)");
            int horaInicio = e.nextInt();
            int minutoInicio = e.nextInt();
            System.out.println("Digite a hora e minutos de término (sepaparadamente)");
            int horaT = e.nextInt();
            int minutoT = e.nextInt();
            int dh;
            int dm;
        if (horaInicio < horaT) {
            dh = horaInicio - horaT;

        }else{
            dh= 24 - horaInicio + horaT;
        } 
        if(minutoInicio < minutoT){
            dm = minutoInicio - minutoT;
        }else{
            dm = 60 - minutoInicio + minutoT;
        }
        System.out.println("A duração do jogo em horas "+dh+" e os minutos totais "+dm+"");
       
           
    }
    
}