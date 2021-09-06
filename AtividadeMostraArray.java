//Faça um loop FOR que recebe e lê um array, com 5 elementos e imprime o se esse elemento é ou não par.


public class AtividadeMostraArray {
     public static void main(String[] args) {
          int varArr [] = {2,5,8,13,21};

          for (int i : varArr) {
               if (i % 2 == 0){
                    System.out.println("Número par.");
               }else{
                    System.out.println("Número ímpar.");
               }
          }
     }
}
