package SetInterfac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
		//set will not store duplicates
		
		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("black");
		colors.add("white");
		colors.add("green");
		colors.add("Red");
		//colors.add("black");//ignored
		colors.add("blue");
		System.out.println(colors.add("white"));
		
		System.out.println(colors.size());
		
		Iterator<String> it= colors.iterator();
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		for(int i=0;i<colors.size();i++) {
		//	System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	

	}

}
