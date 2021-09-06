import java.util.Scanner;

public class ArrayMaiorMenorElem {
     public static void main(String[] args) {
          int arrayInt [] = new int [5];
          Scanner sc = new Scanner(System.in);

          for (int i = 0; i < arrayInt.length; i++) {
               arrayInt[i] = sc.nextInt();
          }
          
          sc.close();
          int maior = arrayInt [0];
          int menor = arrayInt [0];

          for (int i = 0; i < arrayInt.length; i++) {
               if (arrayInt[i] > maior){
                    maior = arrayInt[i];
               }
               else if (arrayInt[i] < menor){
                    menor = arrayInt[i];
               }
          }

          System.out.println("O maior valor no array é " + maior + " e o menor é " + menor + ".\n");
     }
}
