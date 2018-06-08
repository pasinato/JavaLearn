import java.util.Scanner;

/**
Programma per calcolare quanto tempo impiega una popolazione di scarafaggi a
riempire completamente una casa dal pavimento al soffitto.
**/

public class scarafaggi{
  public static final double TASSO_CRESCITA=0.95;//95% per settimana
  public static final double VOLUME_SCARAFAGGIO = 0.00000076;//in metri cubi

  public static void main(String[] args){
    System.out.println("Inserisci il volume della sua abitazone: ");
    System.out.print("in metri cubi: ");
    Scanner tastiera = new Scanner(System.in);
    double volumeCasa= tastiera.nextDouble();

    System.out.println("Inserisci una stima degli");
    System.out.print("scarafaggi nella sua casa: ");
    int popolazioneIniziale = tastiera.nextInt();
    int conteggioSettimane=0;
    double popolazione = popolazioneIniziale;
    double volumeTotaleScarafaggi= popolazione * VOLUME_SCARAFAGGIO;
    double nuoviScarafaggi,volumeNuoviScarafaggi;

    while(volumeTotaleScarafaggi<volumeCasa){

      nuoviScarafaggi= popolazione * TASSO_CRESCITA;
      volumeNuoviScarafaggi = nuoviScarafaggi*VOLUME_SCARAFAGGIO;
      popolazione=popolazione + nuoviScarafaggi;
      volumeTotaleScarafaggi= volumeTotaleScarafaggi+volumeNuoviScarafaggi;

      conteggioSettimane++;
    }

    System.out.println("Con una popolazione iniziale di " +
                      popolazioneIniziale + " scarafaggi");
    System.out.println("e una abitazione con un volume di "+ volumeCasa +
                        " in metri cubi.");
    System.out.println("dopo "+ conteggioSettimane + " settimane.");
    System.out.println("la sua casa ospiterà una popolazione di "+
                      (int)popolazione + " scarafaggi.");
    System.out.println("Che riempirà un volume di "+ (int)volumeTotaleScarafaggi +
                      " metri cubi.");
    System.out.println("E' meglio chiamare gli "+ "Esperti della disifestazione.");
  }
}
