import java.util.Scanner;
import java.lang.Math;
class Assignment1_5{
  public static void main (String[] args){
  Scanner scan=new Scanner(System.in);
   int sec;
   System.out.println("Enter the time in seconds");
   sec=scan.nextInt();//Taking the time in seconds
System.out.printf((int)(sec/3600)+" hours "+(int)((sec%3600)/60)+" minutes "+(sec%60)+" seconds ");//Finding time in hours sec min and seconds


   
  }
}