import java.util.Scanner;
public class VariabileArg{

    /*Restituisce il primo argomento con tutte le occorrenze degli altri argomenti cancellate.*/
    public static String censura(String frase,String... indesiderate){
      for (int i=0;i < indesiderate.length; i++)
        frase= cancellaStringa(frase, indesiderate[i]);
        return frase;
    }

    /*Restituisce frase con tutte le occorrenze di stringa rimosse*/
    public static String cancellaStringa(String frase, String stringa){
      String finale;
      int posizione= frase.indexOf(stringa);
      while(posizione >= 0){//finchè c'è stringa
        finale= frase.substring(posizione +stringa.length());
        frase= frase.substring(0,posizione) + finale;
        posizione= frase.indexOf(stringa);
      }
      return frase;
    }


     public static void main(String[] args) {
        System.out.println("inserisci cosa hai mangiato per cena?");
        Scanner tastiera=new Scanner(System.in);
        String frase= tastiera.nextLine();
        frase=censura(frase,"caramelle","patatine fritte","salato","birra");
        frase=censura(frase," ,");
        System.out.println("Saresti più sano se avessi risposto:");
        System.out.println(frase);
    }
}
