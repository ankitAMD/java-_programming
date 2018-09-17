class pattern24
{
    public static void main(String[] args)
    {
         for(int i=5;i>0;i--)
            {
              for(int k=5;k>=i;k--)
             { 
               System.out.print(k+"");
			 }
            System.out.println();
            }
			 for(int i=1;i<5;i++)
            {
           
			 for (int k=5;k>i;k--)
             { 
               System.out.print(k+"");
			 }
            System.out.println();
            }
    }
}
/*output
5
54
543
5432
54321
5432
543
54
5

 */