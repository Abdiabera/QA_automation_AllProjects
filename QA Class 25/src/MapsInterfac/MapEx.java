package MapsInterfac;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String,Integer> studRec= new HashMap<>();
		studRec.put("mark",65 );
		studRec.put("stev", 90);
		studRec.put("joe",85 );
		studRec.put("alice",75 );
		
		System.out.println(studRec.get("joe"));
		System.out.println(studRec.containsKey("lee"));
		System.out.println(studRec.containsValue(100));
		System.out.println(studRec);

	}

}
