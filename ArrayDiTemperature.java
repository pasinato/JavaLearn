/*  Legge i  valori di 7 temperature inserite dall'utente e mostra quali
    di esse sono al di sopra e al di sotto della media delle temperature
*/

import java.util.Scanner;

public class ArrayDiTemperature{
    public static void main (String[] args){
      double[] temperatura = new double[7];

      //lettura delle temperature e calcolo della loro media;
      Scanner keyboard=new Scanner(System.in);
      System.out.println("inserire 7 temperature:");
      double somma=0;

      for (int i=0; i<7;i++){
        temperatura[i]=keyboard.nextDouble();
        somma+=temperatura[i];
      }

      double media = somma/7;
      System.out.println("La temperatura media è : "+ media);

      //Mostra ogni temperatura e la relazione tra minima e massima rispetto //alla media
      System.out.println("Le 7 temperature sono");
      for(int i =0;i<7;i++){
        if(temperatura[i]<media){
          System.out.println(temperatura[i]+ " sotto la media");
        }else if (temperatura[i]>media){
          System.out.println(temperatura[i]+ " sopra la media");
        }else
        System.out.println(temperatura[i]+ " pari alla media");
      }
      System.out.println("Buona Settimana!!");
    }
}
