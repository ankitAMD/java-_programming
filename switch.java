import java.util.Scanner;
class Switch{
	public static void main(String args[]){
	int number=0 ;
	switch(number){
		case 1:System.out.println("you are human");
		break;
		case 2:System.out.println("you are animal");
		break;
	    default:System.out.println("you are monster");
		break;
	}
	while(number < 10){
		System.out.println(number);
		number++;
	}
	
	}
}