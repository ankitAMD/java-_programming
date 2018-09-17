class Test 
{
 
	public static void main(String[] args) throws InterruptedException
	{
	dostuff(); 
	}	
    public static void dostuff() 
    {
    	doMorestuff(); 
    }
    public static void doMorestuff()
    {	 
     Thread.sleep(100000);
    }
}