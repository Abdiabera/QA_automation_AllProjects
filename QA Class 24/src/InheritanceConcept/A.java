package InheritanceConcept;

public class A {
	
	String lname="Xavier";
	char grade='C';
	
	public void house() {
		System.out.println("house belongs to parent");
	}
	
	public void factory() {
		System.out.println("factory belongs to parent");
	}
	
	public static void main(String[] args) {
		
		A p = new A();
		p.house();
		p.factory();
		System.out.println(p.lname);
		System.out.println(p.grade);
		
	}


}
