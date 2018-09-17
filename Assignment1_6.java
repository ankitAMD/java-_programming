import java.util.Scanner;
class Assignment1_6{
  public static void main (String[] args){
  Scanner scan=new Scanner(System.in);
   double a,b,c,d;
   System.out.println("Enter the coefficients of x*x,x and constant");
   a=scan.nextDouble();
   b=scan.nextDouble();
   c=scan.nextDouble();
   if ((b*b-4*a*c)>0)//Checking for real and distinct
   System.out.println("Real and Distinct Roots");
   else if ((b*b-4*a*c)<0)//Checking for imaginary
   System.out.println("Imaginary Roots");
   else if((b*b-4*a*c)==0)//checking for equal roots
   System.out.println("Real and equal Roots");
   
  }
}