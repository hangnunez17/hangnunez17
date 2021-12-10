//By Hang Núñez

/*Fes un programa que demani per pantalla la mida n de la matriu i generi una
matriu de n x n i l’ompli de la següent manera: La posició (i, j) de la matriu
ha de contenir i+j (la suma dels índex).  Exemple matriu[1][3] = 4 . Un cop
construïda la matriu cal mostrar-la per pantalla.*/

import java.util.Scanner;

public class dadesCompostes_2{
  public static void main(String[] args) {

    Scanner keyboard =new Scanner(System.in);

    //Declarem les variables i les col·loquem en la matriu
    System.out.print("Especifica la longitud de la matriu: ");
    int llargada = keyboard.nextInt();
    int[][] matriu = new int [llargada] [llargada];

//Generem la matriu.
//La matriu anirà molstrant els numeros del 0+1 per cada numero de columna i fila
    for (int x=0; x<llargada; x++){
      System.out.print("[");
      for (int i=0;i<llargada;i++){
        matriu[x][i] = (x + i);
        System.out.print(matriu[x][i]+" ");
      }System.out.println("] ");
    }

  }
}
