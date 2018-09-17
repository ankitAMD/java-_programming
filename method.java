import java.util.Scanner;
class method{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
		parameter parameterObject = new parameter();
		
		System.out.println("enter your name here:");
		String body = input.nextLine();
	
	parameterObject.simpleMessage(body);
		
	}
}