package Methods;

public class ParameterEx {
	
	//methods with arguments / parameters
	public void add(int a, int b)
	
	{
		
		int c=a+b;
		System.out.println("Adddition of two number "+a+"  and "+b+" is  "+c);
	}
	
	
	public void maxNumber(int a, int b) {
		
	
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater ");
	}
	

	public static void main(String[] args) {
	
		ParameterEx p = new ParameterEx();
		p.add(10, 20);
		p.add(30,50);
		p.add(80,60);
		p.maxNumber(40, 30);
		p.maxNumber(90, 100);

	}

}
