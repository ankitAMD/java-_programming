import java.util.Scanner;
class dis{
	private int dis;
	dis(int...a){
		int min=a[0];
		int max=a[0];
		for(int i=1;i<(a.length);i++){
			if (min>a[i])
				min=a[i];
			else if(max<a[i])
				max=a[i];
			
		}
		dis=max-min;
		System.out.println(dis);
	}
}

class Dawood{
public static void main(String[] args){
	Scanner scan =new Scanner(System.in);
	
	int n =scan.nextInt();
	scan.nextLine();
	while(n>0){ 
		n--;
		System.out.println("Enter the numbers");
		
		String a=scan.nextLine();
		String b[]=a.split(" ");
		int c[]=new int[b.length];
		for(int i=0;i<(b.length);i++){
		
		c[i]=Integer.parseInt(b[i]);
		}
		new dis(c);
	}
	}
}