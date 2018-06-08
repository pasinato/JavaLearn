/**
Esempio di programma che verifica se due array sono uguali.
**/

public class TestEqAr{
  public static void main(String[] agrs){
    int a[]=new int[3];
    int b[]=new int[3];
    setArray(a);
    setArray(b);

    if (a==b)
      System.out.println("Uguali per ==.");
      else
      System.out.println("Diversi per ==.");

    if (equal(b,a))
    System.out.println("Uguali per  il metodo equal");
    else
    System.out.println("Diversi per il metodo equal ");

  }

  public static boolean equal(int[] a, int[] b ){
    boolean elEqual=true;

    if(a.length != b.length){
      elEqual = false;
    }else{
      int i =0;
      while(elEqual && (i< a.length)){
        if (a[i] != b[i]){
         elEqual=false;
        }
      i++;
      }
    }

    return elEqual;
  }

  public static void setArray(int[] arr){
    for (int i=0; i< arr.length;i++)
      arr[i]=i;
  }
}
