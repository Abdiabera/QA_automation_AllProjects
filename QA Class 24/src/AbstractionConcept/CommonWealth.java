package AbstractionConcept;

public abstract class CommonWealth  {
	
	public abstract void savings();
	public abstract void insurance();
	public abstract void creditcard();
	public abstract void loans();
	public void kyc() {
		System.out.println("Customer passport is mandatory");
	}
	

	public static void main(String[] args) {
		//object of abstract class cannot be created
	//	CommonWealth c = new CommonWealth();
		
		
	}
}
