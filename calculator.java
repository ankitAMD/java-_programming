import java.util.Scanner;
class calculator {
	public static void main(String args[]){
		Scanner ankit = new Scanner(System.in);
		double fnum,snum,answer;
		System.out.println("enter the first num");
		fnum = ankit.nextDouble();
		System.out.println("enter the second num");
		snum = ankit.nextDouble();
		answer = fnum + snum;
		System.out.println("answer is "+answer);
	}
}