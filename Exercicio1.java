import java.util.Scanner;
public class Exercicio1 {
     public static void main(String[] args) {
          final double pi = 3.14159;
          Scanner sc = new Scanner(System.in);
          double rad = sc.nextDouble();
          sc.close();

          double areaC = pi * (rad*rad);
          double circ = (2*pi*rad);

          System.out.print("A área é igual a: ");
          System.out.printf("%.4f", areaC);
          if (rad > 3.5){
               System.out.printf("\n%s%.2f\n", "A circunferência é igual a ", circ);
          }
     }
}
