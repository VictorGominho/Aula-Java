import java.util.Scanner;
public class Comparacao {    
     public static void main(String[] args) {
          
          System.out.println("Digite o primeiro número: ");
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          
          System.out.println("Digite o segundo número: ");
          int y = sc.nextInt();

          System.out.println("Digite o terceiro número: ");
          int z = sc.nextInt();
          sc.close();

          if (x > y && x > z){
               System.out.print(x + " ");
               if (y > z){
                    System.out.print(y + " " + z);
               }else{
                    System.out.print(z + " " + y);
               }
          }else if (y > x && y > z){
               System.out.print(y + " ");
               if (x > z){
                    System.out.print(x + " " + z);
               }else{
                    System.out.print(z + " " + x);
               }
          }else{
               System.out.print(z + " ");
               if (x > y){
                    System.out.print(x + " " + y);
               }else{
                    System.out.print(y + " " + x);
               }
          }
     }
}
