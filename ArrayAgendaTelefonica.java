import java.util.Scanner;

public class ArrayAgendaTelefonica {
     public static void main(String[] args) {
          String nomes[] = {"Maria", "João", "Eduardo", "Lidia", "Jonas"};
          String num[] = {"(81) 99558-7442", "(81) 99787-8123", "(81) 98821-4435", "(81) 99155-4698", "(81) 99772-2234"};

          Scanner sc = new Scanner(System.in);

          System.out.println("Digite o nome para procurar: ");
          String nomeProc = sc.nextLine().toLowerCase();
          System.out.println("Buscando...");
          sc.close();

          for (int i = 0; i < num.length; i++) {
               if (nomeProc.equals(nomes[i].toLowerCase())){
                    System.out.println("Resultado da procura: \n" + nomes[i] + "\n" + num[i]);
               }
          }

     }

}
