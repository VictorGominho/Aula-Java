import java.util.Scanner;
public class ArrayDividido {
     public static void main(String[] args) {
          int arrayInt [] = new int [10];
          int arrayDiv1 [] = new int [5];
          int arrayDiv2 [] = new int [5];
          
          Scanner sc = new Scanner(System.in);

          for (int i = 0; i < arrayInt.length; i++) {
               arrayInt[i] = sc.nextInt();
          }
          sc.close();

          for (int i = 0; i < arrayInt.length; i++) {
               if (i < 5){
                    arrayDiv1 [i] = arrayInt [i];

               }else if (i >= 5){
                    arrayDiv2 [i-5] = arrayInt [i];
               }
               
          }
           int maior1 = arrayDiv1[0];
           int maior2 = arrayDiv2[0];

          for (int i = 1; i < arrayDiv1.length; i++) {
               if (arrayDiv1[i] > maior1){
                    maior1 = arrayDiv1[i];
               }
          }
          for (int i = 1; i < arrayDiv2.length; i++) {
               if (arrayDiv2[i] > maior2){
                    maior2 = arrayDiv2[i];
               }
          }
          System.out.println("O maior valor da primeira metade é " + maior1 + " e o da segunda metade é " + maior2 + ".\n");     
     }
}
