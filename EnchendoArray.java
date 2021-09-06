import java.util.Scanner;

public class EnchendoArray {
     public static void main(String[] args) {
          int arrayInt [] = new int[5];

          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < arrayInt.length; i++) {
               arrayInt[i] = sc.nextInt();
          }
          sc.close();
          for (int i = 0; i < arrayInt.length; i++) {
               System.out.print(arrayInt[i] + " ");
          }
     }
}
