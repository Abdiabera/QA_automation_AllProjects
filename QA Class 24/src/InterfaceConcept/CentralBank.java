package InterfaceConcept;

public interface CentralBank {
	
	//unimplement methods or methods without body
	
	public void savings();
	public void insurance();
	public void creditcard();
	public void loans();
	public void kyc();
	
	public static void main(String[] args) {
		
		//you cannot create object of interface
		
		//CentralBank c = new CentralBank();
		
	}

}
