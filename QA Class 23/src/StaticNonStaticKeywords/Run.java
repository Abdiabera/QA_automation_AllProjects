package StaticNonStaticKeywords;

public class Run {

	public static void main(String[] args) {
		
		MathOp mat= new MathOp();
		mat.div();
		
		System.out.println("*******");
		Operation2 op= new Operation2();
		op.div();
		
		Operation2.sub();
		

	}

}
