public class BubbleDemo{
   public static void main(String[] args) {
    int[] b={7,5,11,2,16,4,18,14,12,30};
    visualizza(b," prima dell'ordinamento");
    OrdineArray.bubbleSort(b);
    visualizza(b," dopo dell'ordinamento");
  }

  public static void visualizza(int[] arr,String quando){
    System.out.println("Valori dell'array" + quando + ":");

    for(int i=0; i<arr.length;i++)
      System.out.print(arr[i] + " ");

  System.out.println();
  }
}
