import java.util.Scanner;

public class FormattaEuroProvaDriver{

  public static void main(String[] args){
    double somma;
    String risposta;
    Scanner tastiera=new Scanner(System.in);

    System.out.println("Test FormattaEuroProvaDriver.scrivi:");
    do{
        System.out.println("Inserisci un valore di tipo double:");
        somma= tastiera.nextDouble();
        FormattaEuro.scrivi(somma);
        System.out.println();
        System.out.println("Testare ancora?");
        risposta=tastiera.next();
    }while(risposta.equalsIgnoreCase("si"));

    System.out.println("Fine del test.");
  }
}
