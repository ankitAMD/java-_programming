import java.util.Scanner;
public class Nmax {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n,i=0;
        System.out.println("Enter the number");
        n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" numbers");
		do{
		a[i]=scan.nextInt();
		i++;
		}while(i<n);
		int j=1,max=a[0];
		do{
			if (a[j]>max){
			max=a[j];
			}
			j++;
		}while(j<n);
		System.out.println("The maximum number is "+max);
        
    }
    
}
