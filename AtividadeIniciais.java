import java.util.Scanner;

public class AtividadeIniciais {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Digite uma inicial dos dias da semana(d, s, t, q): ");
          char dia = sc.next().toLowerCase().charAt(0);
          sc.close();
          
          switch(dia){
               case 's':
                    System.out.println("Segunda, Sexta, Sábado");
                    break;
               case 'd':
                    System.out.println("Domingo");
                    break;
               case 't':
                    System.out.println("Terça");
                    break;
               case 'q':
                    System.out.println("Quarta, Quinta");
                    break;
               default:
                    System.out.println("Inicial inválida!");
                    break;                
          }
     }
}
