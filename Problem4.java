import java.util.Scanner;
class Problem4{
	public static void main(String args[]){
		
		Scanner scan =new Scanner(System.in);
		while(true){
		int n=scan.nextInt();
		if (n==0)
			break;
		float d[]=new float[n];
		double a=0.00,count=0.00;
		int i=0;
		
		while(i<n)
		{
			d[i]=scan.nextFloat();
			a+=d[i];
			i++;
		}	
		a=a/n;
		a=(float)Math.round(a*100.0)/100.0;
		for(i=0;i<n;i++){
			if(d[i]>a){
				count+=d[i]-a;
			}
		}
		System.out.printf("INR %.2f\n",count);
	}
	}
}