/*  Legge i  valori di 7 temperature inserite dall'utente e mostra quali
    di esse sono al di sopra e al di sotto della media delle temperature
*/

import java.util.Scanner;

public class ArrayDiTemperature2{
    public static void main (String[] args){

      //lettura delle temperature e calcolo della loro media;
      Scanner keyboard=new Scanner(System.in);
      System.out.println("Quante temperature si devono inserira?");
      int dimensione=keyboard.nextInt();
      double[] temperatura = new double[dimensione];
      //Lettura e calcolo della media:
      System.out.println("Inserire "+ temperatura.length + " temperature");
      double somma=0;

      for (int i=0; i<temperatura.length;i++){
        temperatura[i]=keyboard.nextDouble();
        somma+=temperatura[i];
      }
      double media = somma/temperatura.length;
      System.out.println("La temperatura media è : "+ media);

      //Mostra ogni temperatura e la relazione tra minima e massima rispetto //alla media
      System.out.println("Le "+ temperatura.length + " temperature sono");
      for(int i =0;i<temperatura.length;i++){
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
