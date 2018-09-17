import java.util.Scanner;
public class Nnum {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the number");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
        sum+=i;
        }
        System.out.println("The sum is "+	sum);
        
    }
    
}
