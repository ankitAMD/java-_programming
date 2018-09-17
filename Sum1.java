import java.util.Scanner;
class Sum{
public static void main(String args[]){
int sum=0;
 System.out.println("input no.");
 Scanner ak=new Scanner(System.in);
 int n = ak.nextInt();
 for(int i =0;i<=n;i++)
 {
 sum = sum+i;
 }
 System.out.println("sum:"+sum);
 }
}