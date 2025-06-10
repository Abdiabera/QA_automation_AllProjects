package PolyMorphismMethodOverriding;

public class B extends A  { // is a relationship
	
	//changing the implementation of parent in child class
	public void house() {
		
		System.out.println("house is owned by class B");
	}
	
	


	public static void main(String[] args) {
		B b = new B();
		b.house();
		b.car();
		
	
	}

}
