import java.util.Scanner;

public class RepeticaoWhile {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String frase = "";

          while(!frase.equals("Sair")){
               System.out.println("Somos Cesar!");
               frase = sc.nextLine();
          }
     }
}
