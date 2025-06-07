package ReturnTypes;

public class ReturnTypeEx1 {
	
	public boolean method1() {
		int p=10;
		double j=23.65;
		String name="Peter";
		char grade='A';
		boolean flag=true;
		
		return flag;
		
		
		
	}

	public static void main(String[] args) {
		ReturnTypeEx1 r= new ReturnTypeEx1();
		
		boolean t=r.method1();
		System.out.println(t);
		
		

	}

}
