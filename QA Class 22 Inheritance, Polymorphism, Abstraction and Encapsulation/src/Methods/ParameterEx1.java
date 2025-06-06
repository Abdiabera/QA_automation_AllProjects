package Methods;

public class ParameterEx1 {
	
	public void replaceWord(String input, String oldWord, String newWord ) {
		
		String output=input.replaceAll(oldWord, newWord);
		System.out.println(output);
		
	}
	
	public void toUpperCase(String input) {
		
		String out=input.toUpperCase();
		System.out.println(out);
	}

	public static void main(String[] args) {
		
		ParameterEx1 p= new ParameterEx1();
		
		p.replaceWord("Welcome to Janbask training", "Janbask","NewJanbask");
		p.replaceWord("Testing is easy", "Testing", "Java");
		p.toUpperCase("Kevin is a smart Student");
		

	}

}
