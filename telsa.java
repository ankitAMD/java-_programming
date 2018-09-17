public class telsa{
	private String girlname;
	 
	 public telsa(String name){
		 girlname = name ;
	 }
	 public void setname(String name){
		 girlname = name;
	 } 
	 public String getname(){
		 return girlname;
	 }
	 public void saying(){
		 System.out.printf("your first gf is %s\n",getname());
	 }
}