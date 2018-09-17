class pattern25
{
    public static void main(String[] args)
    {
         for(int i=1;i<=5;i++)
            {
              for(int k=i;k>=1;k--)
             { 
               System.out.print(k+"");
			 }
            System.out.println();
            }
			 for(int i=4;i>=1;i--)
            {
           
			 for (int k=i;k>=1;k--)
             { 
               System.out.print(k+"");
			 }
            System.out.println();
            }
    }
}
/*output
1
21
321
4321
54321
4321
321
21
1

 */