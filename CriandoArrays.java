public class CriandoArrays {
     public static void main(String[] args) {
          int arrayInteiro [] = new int[10];

          String arrayString [] = new String[10];

          int arrayExe [] = {1,2,3,4,5};

          int matriz [][] = new int [2][2]; //linha e coluna
          

          for (int i = 0; i < matriz.length; i++) { // laço exterior: pra cada linha
               for (int j = 0; j < matriz.length; j++) { // laço interior: pra cada coluna
                    matriz[i][j] = j + i;
                     
               }
          }
          for (int i = 0; i < matriz.length; i++) {

               System.out.println(matriz[i][0] + " " + matriz[i][1]);
          }     
   
   
     }
}