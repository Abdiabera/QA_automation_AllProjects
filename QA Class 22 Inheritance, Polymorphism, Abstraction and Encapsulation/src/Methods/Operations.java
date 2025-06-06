package Methods;

public class Operations {
	
	//function or method
	//access modifer  returnType methodname
	public void add()
	
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Adddition of two number "+a+"  and "+b+" is  "+c);
	}
	
	public void sub()
	{
		int k=80;
		int m=40;
		int n=k-m;;
		System.out.println("Subraction of two number "+k+"  and "+m+" is  "+n);
		
	}
	
	public void div() {
		
		int h=10;
		int l=2;
		int p=h/l;
		System.out.println("Division of two number "+h+"  and "+l+" is  "+p);
	}
	
	public static void main(String[] args) {
		
	//object
	//classname objectNam = new ClassName()
	Operations	op= new Operations();
	op.add();
	op.sub();
	op.div();
	
		
		
		
		
	}

}
