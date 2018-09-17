import java.util.Scanner;
import java.lang.Math;
class Assignment1_4{
  public static void main (String[] args){
  Scanner scan=new Scanner(System.in);
   float centi,inches;
   System.out.println("Enter the distance in centimetres");
   centi=scan.nextFloat();//Taking in centimetres
   inches=(float)(centi/2.54);//converting into inches
System.out.printf("%d feet %.1f inches",(int)(inches/12),(inches%12));//finding inches and foot



   
  }
}