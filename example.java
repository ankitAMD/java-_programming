class Apple{
	int a,b,total;
	void add() {
	    total=a+b;
	}
}
class Example{
	public static void main(String args[])
	{
		Apple obj = new Apple();
		obj.a = 10;
		obj.b =  20;
		obj.add();
		System.out.println("Addition"+obj.total);
	}
	
}