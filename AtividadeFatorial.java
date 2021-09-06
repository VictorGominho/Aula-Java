import java.util.Scanner;

public class AtividadeFatorial {
     public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
          System.out.print("Digite um número: ");
          int fator = input.nextInt();
          int resultado = 1;     
          for(int i = 1; i <= fator; i++){
              resultado = resultado * i;
          }
          System.out.println("O fatorial de " + fator + " é igual a " + resultado);
          input.close();
      }
}  
