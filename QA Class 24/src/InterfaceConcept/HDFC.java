package InterfaceConcept;

public class HDFC implements CentralBank{ 

	public static void main(String[] args) {
		
		HDFC h = new HDFC();
		h.savings();
		h.insurance();
		h.creditcard();
		h.loans();

	}

	@Override
	public void savings() {
		System.out.println("HDFC saving interest rate is 4.5%");
		
	}

	@Override
	public void insurance() {
		System.out.println("HDFC insurance is 100$");
		
	}

	public void locker() {
		
	}

	@Override
	public void loans() {
		System.out.println("HDFC loans is 3.5%");
		
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}
}
