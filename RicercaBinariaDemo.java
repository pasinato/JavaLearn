import java.util.Scanner;
public class RicercaBinariaDemo{

  public static int ricercaBinaria(int[] a,int obiettivo, int primo,int ultimo){
    int risultato=0;
    if(primo > ultimo)
        risultato = -1;
    else{
      int med=(ultimo + primo)/2;
      if(obiettivo == a[med])
        risultato = med;
      else if(obiettivo < a[med])
        risultato = ricercaBinaria(a,obiettivo,primo,med - 1);
      else
        risultato = ricercaBinaria(a,obiettivo,med + 1,ultimo);
    }
    return risultato;

  }
  //precondizione:array è pieno e ordinato in senso crescente
  public static int trova(int[] a ,int obiettivo){
    return ricercaBinaria(a,obiettivo,0,a.length-1);
  }

public static void main(String[] args) {
  int[]a =new int[10];
  Scanner t=new Scanner(System.in);
  System.out.println("Inserire 10 interi in ordine crescente, ");
  for(int i=0; i< 10;i++)
    a[i]=t.nextInt();

  System.out.println();

  for(int i=0;i<10;i++)
    System.out.print("a[" + i + "]=" + a[i] + " ");

  System.out.println();
  System.out.println();

  String risposta;
  do {
    System.out.println("Inserire un valore da cercare:");
    int obiettivo=t.nextInt();
    int risultato= OrdineArray.trova(a,obiettivo);
    if(risultato<0)
      System.out.println(obiettivo + " non è nell'array.");
    else
      System.out.println(obiettivo + " è la posizione " + risultato);

    System.out.println("Nuova ricerca?");
    risposta=t.next();

  } while (risposta.equalsIgnoreCase("si"));
  System.out.println("Possa tu trovare ciò  che stai cercando.");

}
}
