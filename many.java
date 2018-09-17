import java.util.Scanner;
 class many{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 tunaa tunaaObject = new tunaa();
		 System.out.println("enter the first gf here:");
		 String temp =input.nextLine();
		 tunaaObject.setName(temp);
		 tunaaObject.saying();
	 }
 }