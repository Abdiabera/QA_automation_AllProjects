package StaticNonStaticKeywords;

public class MathOp {
	
	
	public void div() {
		System.out.println("calling div in math op");
	}
	
	public static void sub() {
		
		System.out.println("calling sub method in math op");
	}

	public static void main(String[] args) {
		
		
		MathOp m = new MathOp();
		m.div();
		sub();
		
		sub();
		
		
	}

}
