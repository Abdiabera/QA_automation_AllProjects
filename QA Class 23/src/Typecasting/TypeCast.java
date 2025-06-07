package Typecasting;

public class TypeCast {

	public static void main(String[] args) {
		
		//integer to double
		int value=100;
		double output=value;
		System.out.println(output);
		
		
		//double to int
		double height =5.10;
		int convertedValue=(int) height;
		System.out.println(convertedValue);
		
		
		//string to int
		String age="56";
		
		int ConvAge=Integer.parseInt(age);
		
		if(ConvAge>60)
			System.out.println("is Senior Citizen");
		else
			System.out.println("is not Senior Citizen");
		
		

	}

}
