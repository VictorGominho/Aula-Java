import java.util.Scanner;

public class Expressao {
     public static void main(String[] args) {
          int num1 = 4;
          int num2 = 9;
          int maior;

          maior = num1 > num2 ? num1 : num2; /* se a expressão antes da interrogação of verdadeira,
                                                atribui o valor da esquerda para "maior", caso contrário
                                                atribui o valor da direita. */  
          System.out.println(maior);

          Scanner sc = new Scanner(System.in);
          int usu1 = sc.nextInt();
          int usu2 = sc.nextInt();
          sc.close();
          int maiorUsu;

          maiorUsu = usu1 > usu2 ? usu1 : usu2;
          System.out.print("Maior número: ");
          System.out.println(maiorUsu);

          System.out.println(usu1 > usu2 ? usu1 : usu2);
     }
}
