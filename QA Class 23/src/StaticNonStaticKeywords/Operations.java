package StaticNonStaticKeywords;

public class Operations {
	
	static String name="Kevin";
	static int age=30;
	
public static void add()
	
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Adddition of two number "+a+"  and "+b+" is  "+c);
	}

public static void sub()
{
	int k=80;
	int m=40;
	int n=k-m;;
	System.out.println("Subraction of two number "+k+"  and "+m+" is  "+n);
	
}

	public static void main(String[] args) {
		
		
	    add();
		sub();
		System.out.println(name);
		System.out.println(age);
		

	}

}
