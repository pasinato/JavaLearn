// Classe per ordinare un array di tipo dal più piccolo al più grande.

public class OrdineArray{

  /* precondizione: Ogni elemento nell'array ha un valore.
     Azione: Ordina l'array in senso crescente.
  */
  /* _________________________ SELECTION SORT ______________________*/
  public static void selectionSort(int[] unArray){
    for(int i=0; i<unArray.length -1;i++){
      //Posiziona il valore corretto in unArray[indice]
      int iNextSmallest= getIndexSmall(i,unArray);
      scambio(i,iNextSmallest,unArray);
    }
  }

  public static int getIndexSmall(int i ,int[] a){
    int minimo=a[i];
    int indiceMinimo=i;
    for(int j=i+1;j<a.length;j++){
      if (a[j]<minimo){
        minimo=a[j];
        indiceMinimo=j;
      }
    }
    return indiceMinimo;
  }

  public static void scambio(int i,int j,int[] a){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
  /*_________________________ BUBBLE SORT _________________________*/
  public static void bubbleSort(int[] a){
    for (int i=0;i<a.length; i++){
      for (int k=0 ; k < (a.length - 1); k++){
        if (a[k] > a[k+1])
          scambio(k,k+1,a);
      }
    }
  }

 /*_________________________ INSERCTION SORT ______________________*/

  public static void inserctionSort(int[] a){
    for (int i=0; i<a.length;i++){
      int key=a[i];
    int j=i-1;
      while(j>=0 && a[j]>key){
        a[j+1]=a[j];
        j=j-1;
      }
      a[j+1]=key;
    }
  }

  /*_________________________ Ricerca Binaria ______________________*/
  //precondizione:array è pieno e ordinato in senso crescente
  /*
    Utilizza la ricerca binaria per cercare obiettivo tra gli elementi di a[primo] a a[ultimo] compresi.
    Restituisce la posizione di obiettivo se presente.
    Restituisce -1 se obiettivo non è nell'array
  */
  public static int ricercaBinaria(int[] a,int obiettivo, int primo,int ultimo){
    int risultato=0;
    if(primo>ultimo)
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

  /*_________________________ Merge Sort ______________________*/










}
