package InheritanceConcept;

public class C extends A {
	
	public void car() {
		System.out.println("child owns car");
	}
	


	public static void main(String[] args) {
		
		C c = new C();
		c.car();
		c.house();
		c.factory();
		System.out.println(c.grade);
		System.out.println(c.lname);
	
		
	}

}
