import java.util.Scanner;

class Problem3{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	while(true){
	int a[]=new int[2];
	String s=scan.nextLine();
	String b[]=s.split(" ");
	if(s.length()==0)
		break;
	for(int j=0;j<2;j++)
		a[j]=Integer.parseInt(b[j]);
		
		
	int max=0;
	for(int i=a[0];i<=a[1];i++){
		int count=1;
		int k=i;
		while(k!=1){
			if(k%2==0){
				k=k/2;
				}
			else{
				k=k*3+1;
			}
			count++;			
			}
		if (max<count)
			max=count;
		}
	System.out.println(a[0]+" "+a[1]+" "+max);	
}
}}