package PolyMorphism;

public class OverloadingEx {
	
	//same method name but different argument
	
	public void info() {
		System.out.println("calling info");
	}
	
	public void info(int a) {
		
		System.out.println("calling info other method");
	}
public void info(String b) {
		
		System.out.println("calling info String argument method");
	}

public void info(int a,double b) {
	
	System.out.println("calling info int and double argument method");
}

	public static void main(String[] args) {
	
		OverloadingEx o= new OverloadingEx();
		
		o.info(65,23.65);
	

	}

}
