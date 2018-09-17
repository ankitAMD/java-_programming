import java.util.Scanner;
class Assignment1_3{
  public static void main (String[] args){
  Scanner scan=new Scanner(System.in);
   double h,r;
   System.out.println("Enter the height and radius of cylinder");
	h=scan.nextDouble();//taking height
	r=scan.nextDouble();//takind radius
System.out.printf("The Volume of the cylinder is "+(3.14*r*r*h));//finding volume


   
  }
}