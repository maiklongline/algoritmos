import java.util.Scanner;

public class duracaoComSegundos {
   
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe a duração em segundos do evento");
        int duracao = e.nextInt();
        //uso de 3600 pois é total que possui em uma hora
        int horas = duracao / 3600; // 1 hora = 3600s
        int minutos = (duracao % 3600) / 60;
        int segundos = (duracao % 60);

        System.out.printf("a duração do evento foi %ds as horas totais ficaram %dh e minutos atribuídos %dmin e segundos finais %ds%n" , duracao , horas , minutos , segundos);

    }
}
