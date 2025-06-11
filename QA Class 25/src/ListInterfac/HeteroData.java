package ListInterfac;

import java.util.ArrayList;
import java.util.List;

public class HeteroData {

	public static void main(String[] args) {
	
		List<Object> studData= new ArrayList<>();
		
		studData.add("John");
		studData.add(23);
		studData.add(5.3);
		studData.add('A');
		
		System.out.println(studData.get(1));
	}

}
