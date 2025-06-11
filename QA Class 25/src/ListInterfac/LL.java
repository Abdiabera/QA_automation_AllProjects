package ListInterfac;

import java.util.LinkedList;
import java.util.List;

public class LL {

	public static void main(String[] args) {
		
		List<String> stud= new LinkedList<>();

		stud.add("Steve");
		stud.add("robin");
		stud.add("bruce");
		stud.add("Lee");
		stud.add("robin");
		
		System.out.println(stud.size());
		stud.add("Joe");
		stud.add("Kevin");
		System.out.println(stud.size());
		
		//System.out.println(stud.get(5));
		
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
		
		System.out.println(stud.contains("Lee"));
		System.out.println(stud.contains("mark"));
		stud.remove(1);
		stud.add(3, "Peter");
		System.out.println("*******");
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
		
		
		
	}

}