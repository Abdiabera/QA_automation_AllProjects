package tryCatch;

public class TryCatchEx {

	public static void main(String[] args) {
		
		try{
			
		 int a = 2;
         int b = 0;
         int c = a/b;  
         System.out.println ("Result = " + c);
         
		}
		
		catch(Exception e) {
			
			System.out.println("try block failed");
			e.printStackTrace();
			
		}
       
         System.out.println("eND OF THE PROGRAM");
         int k=40;
         int m=30;
         int u=k+m;   
         System.out.println("addition of "+k+" and "+m +" is "+u);

	}

}
