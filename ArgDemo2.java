import java.util.Scanner;

//Esempio di metodo che restituisce una array

public class ArgDemo2{
  public static void main(String[] args){

    Scanner keyb=new Scanner(System.in);
    System.out.println("Inserire il voto dell'esame 1:");
    int initialScore= keyb.nextInt();
    int[] nextScore= new int[3];

    for(int i=0; i < nextScore.length;i++)
      nextScore[i]= initialScore + 5 * i;

    double[]scoreAvg= obtainScoreAvg(initialScore,nextScore);

      for (int i=0; i< nextScore.length;i++){
        System.out.println("Se il voto all'esame 2 sarà "+ nextScore[i]);
        System.out.println("la media sarà uguale a " + scoreAvg[i]);
      }
  }

  public static double[] obtainScoreAvg(int initialScore,int[] nextScore){
    double[] tmp= new double[nextScore.length];
    for (int i=0; i<tmp.length;i++)
      tmp[i]=getMedia(initialScore,nextScore[i]);

      return tmp;
  }

  public static double getMedia(int n1 , int n2){
    return (n1+n2)/2.0;
  }

}
