package ReturnTypes;

public class ReturnTypeEx {
	
	
	public int add() 
	{
		
		int a =90;
		int b=200;
		int c=a+b;
		//System.out.println("Addition of two numbers is : "+c);
		return c;
	}
	

	public static void main(String[] args) {
		
		ReturnTypeEx r= new ReturnTypeEx();
		int out= r.add();// this method now give output of int
		
		System.out.println(out);
		if(out%2==0)
			System.out.println(out+" is even number");
		else
			System.out.println(out+" is odd number");

	}

}
