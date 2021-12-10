//By Hang Núñez

/*Fes un programa que llegeixi n números enters i els guardi en un vector
(matriu d'una dimensió). A continuació generi dos vectors amb la mida exacta
per emmagatzemar els elements senars i els parells del vector original.
(la mida exacta de números parells i senars en cada cas) Finalment mostri els
dos vectors generats.*/

import java.util.Scanner;

public class dadesCompostes_1{
  public static void main(String[] args) {

    Scanner keyboard =new Scanner(System.in);
           //Demanar informació al usuari
           System.out.print("Introdueix el rang que vols que tingui la llista: ");
           int num_user = keyboard.nextInt();
           //Definir llistes i variables
           int [] list;
           list = new int [num_user];
           int [] elementparell;
           elementparell = new int [num_user];
           int [] elementsenar;
           elementsenar = new int [num_user];
           int lastNum = num_user -1;

           System.out.print("Matriu generada: ");
           System.out.print("[");
           for (int i=0;i<=lastNum;i++){
               int randomNum= (int)((Math.random()*99)+1);
               System.out.print(+randomNum+","+ " ");
               list[i] = randomNum;
           }//for random
           System.out.println("]");

//Calcular si son numeros parells o senars
            for (int i=0; i<num_user; i++){
             if ((list[i]%2)==0){
              elementparell[i]= list[i];
            }else{
              elementsenar[i]= list[i];
              }
            }
    //Identifiquem quins Numeros són Pars
          System.out.print("Numeros Pars: ");
          System.out.print("[");
          for (int i=0;i<elementparell.length;i++){
            if(elementparell[i] !=0){
              System.out.print(elementparell[i]+" ");
          }//if
        }//for
        System.out.println("]");
    //Identifiquem quins Numeros són Senars
        System.out.print("Numeros senars: ");
        System.out.print("[");
        for (int i=0;i<elementsenar.length;i++){
          if(elementsenar[i] !=0){
            System.out.print(elementsenar[i]+" ");
          }
        }
      System.out.println("]");

  }
}
