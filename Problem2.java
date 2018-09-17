import java.util.Scanner;

class Problem2{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	Double a;
	while(true)
	{
		
		int i=0;
		a=scan.nextDouble();
		if(a==0.00)
			break;
		else{
			while(a>0)
			{	i++;
				a-=(1.00/(i+1));
				
			}
		}
	System.out.println(i+" card(s)");
	}	
	}
}



