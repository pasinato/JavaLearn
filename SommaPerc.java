import java.util.Scanner;

public class SommaPerc{
  
  public static void main(String[] args) {
    Scanner tastiera=new Scanner(System.in);
    String user;
    int qta;
    float somma=0;
    boolean s=true;
    float perc;
    do{
      System.out.println("Quanti numeri verranno inseriti? ");
      qta=tastiera.nextInt();
      int[] a= new int[qta];
      System.out.println("Inserire "+ qta +" interi,uno per riga:");
      for (int i=0;i<qta;i++){
        a[i]=tastiera.nextInt();
        somma+=a[i];

      }
      System.out.println("La somma è: "+ somma);

      System.out.println("I numeri sono:");
      for(int j=0;j<qta;j++){
        perc=(a[j]*100)/somma;
        System.out.print(a[j] + " " );
        System.out.printf("che è il  %6.4f",perc);
        System.out.println("% della somma.");

      }

      System.out.println("Sicuro/a di voler continuare?:(Yes/No) ");

      user=tastiera.next();
      switch (user){
        case "y":
        case"Y":
        case"Yes":
        case"yes":
            s=true;break;
        case "n":
        case"N":
        case"No":
        case"no":
            s=false;break;
        default:
          System.out.println("Error digit");
      }
    }while (s);

  }



}
