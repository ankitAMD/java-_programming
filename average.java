import java.util.Scanner;
 
 class average{
	public static void main(String[] args){
		Scanner ankit = new Scanner(System.in);
		int  total=0,counter=0;
		int grade,average;
		
		while(counter<5){
			grade=ankit.nextInt();
			total=total+grade;
			counter++;
		}
		average = total/5;
		System.out.println("your average of no is"+average);
		System.out.println("your total of no is"+total);
		
	}
}