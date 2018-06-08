/*Massimo tra un numero qualunque di interi */
import java.util.Scanner;
public class NVarArg{

  public static int massimo (int... arg){
    if (arg.length == 0){
      System.out.println("Errore: nessun valore predefinito");
      System.exit(0);
    }

    int m=arg[0];
    for (int i =1 ; i < arg.length;i++){
        if (m<arg[i])
        m=arg[i];
    }
    return m;
  }

  public static void main (String[] args){
    Scanner keyb=new Scanner(System.in);
    System.out.println("Inserire quanti dati vuoi :");
    int l= keyb.nextInt();
    System.out.println("Inserire i punteggi:");
    int[] punteggio= new int[l];
    for (int i=0; i< l;i++){
      punteggio[i]= keyb.nextInt();
    }
    int max=massimo(punteggio);
    System.out.println("punteggio massimo = " + max);

  }
}
