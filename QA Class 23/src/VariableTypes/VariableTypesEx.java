package VariableTypes;

public class VariableTypesEx {
	//global variable
	int a=10;
	double b=90.32;
	int d=100;
	
	public void func() {
	
		//local variable
	
		double k=63.35;	
		char c='P';
		System.out.println(d);
		//System.out.println(k);
		//System.out.println(c);	
	}
	
	public void method() {
		int d=70;
		double k=19.20;
		System.out.println(d);
		//System.out.println(k);
		char c='K';
		//System.out.println(c);
		
	}

	public static void main(String[] args) {
	
		
		VariableTypesEx v= new VariableTypesEx();
		v.func();
		System.out.println("***************************");
		v.method();

		

	}

}
