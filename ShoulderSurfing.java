import java.util.Scanner;



public class ShoulderSurfing{
  public static final int N=10;
  public static final int NP=6;


  public static void main(String[] args) {
    int[] pin ={1,4,0,8,2,9};
    int[] mask= new int[N];
    int[] resp= new int[NP];

    Scanner t=new Scanner(System.in);
    System.out.printf("Pin:   0 1 2 3 4 5 6 7 8 9");
    System.out.println();
    //genera


    for (int j=0;j<N ;j++){
      mask[j]=(int)(Math.random()*10);
    }
    //Srive numeri casuali
    System.out.print("Num:   ");
    //Visualizza i numeri casuali
    for (int i=0;i<N;i++){
      System.out.print(mask[i] + " ");
    }
      System.out.println();
    //inserimento pin
    System.out.println("inserire il pin:");
    for (int i =0;i<NP;i++){
      resp[i]=t.nextInt();

    }
    //controllo password
    boolean flag=false;
    for (int i=0;i<NP;i++){
        if (mask[pin[i]]==resp[i])
          flag=true;
    }
    if (flag == true){
      System.out.println("PASSWORD CORRECT!!");}
      else{
    System.out.println("!!!!WARNING:PASSWORD INCORRECT!!!!");}
  }




}
