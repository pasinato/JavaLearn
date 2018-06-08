import java.util.Scanner;

public class ArgDemo{
  public static void main(String[] args){

    Scanner keyb=new Scanner(System.in);
    System.out.println("Inserire il voto dell'esame 1:");
    int initialScore= keyb.nextInt();
    int[] nextScore= new int[3];

    for(int i=0; i < nextScore.length;i++)
      nextScore[i]= initialScore + 5 * i;


      for (int i=0; i< nextScore.length;i++){
        double ScoreAvg= getMedia(initialScore, nextScore[i]);
        System.out.println("Se il voto all'esame 2 sarà "+ nextScore[i]);
        System.out.println("la media sarà uguale a " + ScoreAvg);
      }
  }

  public static double getMedia(int n1 , int n2){
    return (n1+n2)/2.0;
  }

}
