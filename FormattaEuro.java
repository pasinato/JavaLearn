public class FormattaEuro{

  public static void scrivi(double somma){
    if (somma>=0){
      System.out.print('E');
      scriviPositivo(somma);
    }else{
      double sommaPositiva= - somma;
      System.out.print('E');
      System.out.print('-');
      scriviPositivo(sommaPositiva);
    }
  }

  public static void scriviPositivo(double somma){
    int centesimiTotali=(int)(Math.round(somma * 100));
    int euro= centesimiTotali/100;
    int centesimi= centesimiTotali %100;

    System.out.print(euro);
    System.out.print('.');

    if(centesimi<10){
      System.out.print('0');
      System.out.print(centesimi);
    }else
      System.out.print(centesimi);
  }

  public static void scriviRiga(double somma){
      scrivi(somma);
      System.out.println();
  }

}
