import java.util.Scanner;

class Kerror{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String a="QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
	String c[]=a.split("");
	String b[]=scan.nextLine().split("");
	for (int i=0;i<b.length;i++){
		if(!(b[i].equals("Q")||b[i].equals("A")||b[i].equals("Z")||b[i].equals(" ")))
				b[i]=c[a.indexOf(b[i])-1];
	
	}
	System.out.println(String.join("",b));
	}
}



