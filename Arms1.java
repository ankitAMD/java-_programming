class Arms1{
public static void main(String args[])
{
 for (int i=1;i<=999;i++){
	   int l=Integer.toString(i).length();
	   int arm=0;
	   int k=i;
	   do{
	   arm+=(int)Math.pow((k%10),l);
	   k=k/10;
	   }while(k>0);
	   if(arm==i)
	   System.out.println(i);
}
}
}