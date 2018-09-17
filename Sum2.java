import java.util.Scanner;

class Sum2{
     public static void main(String args[]){
            System.out.println("Enter the no.you want to insert:");
             Scanner ak = new Scanner(System.in);
             int n =ak.nextInt();
             int nu[] = new int[n];
             int i=0;
             do
			 {
			 nu[i]=ak.nextInt();
			 i++;
			 }
			 while(i<n);
			 int max =nu[0];
			 int min =nu[n-1];
			 i=0;
			 int j;
			 if(n==0){
			 j=1;
			 max=nu[i];
			 }
			 else
			 {
			 do{
			 j=n-1;
			 do{if(nu[i]>nu[j])
			 max=nu[i];
			 else
			 max = nu[j];
			 j--;
			 }while(j>i);
			 i++;
			 }while(i<n);
			 }
			 System.out.println(max);
			 } 
}