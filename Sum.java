import java.util.*;
class Sum
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number for Addition : ");

int x = sc.nextInt();
int y = sc.nextInt();
int z = x+y;
System.out.println("Enter your name : ");
String name = sc.nextLine();
System.out.println("Enter your Father's name : ");
String fname = sc.nextLine();
System.out.println("Enter your Mother's name : ");
String mname = sc.nextLine();
System.out.println("Enter your age and lucky no.(1-10) : ");
int age = sc.nextInt();
int number = sc.nextInt();
float luck = number*9.5f;
System.out.println(x);
System.out.println(y);
System.out.println("Sum = "+z);
System.out.println("Name : "+name);
System.out.println("Father's name : "+fname);
System.out.println("Mother's name : "+mname);
System.out.println("Age : "+age+ " Luck : "+luck+"%");
}
}
