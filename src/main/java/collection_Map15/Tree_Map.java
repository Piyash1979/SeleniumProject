package collection_Map15;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		// Maintains ascending order
		
		Map<String, String> emp=new TreeMap<String, String>();
		
		emp.put("Anila", "hoque");
		emp.put("Sharif", "Islam");
		emp.put("Saiful", "Islam");
		emp.put("Ripa", "Islam");
		emp.put("Ainun", "Nahar");
		emp.put("Mahin", "Sultana");
		emp.put("Shahid", "Uddin");
		emp.put("Shanta", "Rahman");
		
		System.out.println(emp.size());
		System.out.println(emp.entrySet());
		System.out.println(emp.containsKey("Ripa"));
		emp.remove("Saiful");
		System.out.println(emp.containsKey("Saiful"));

		for(Entry<String, String> eachemp:emp.entrySet()) {
			//System.out.println(eachemp);
			System.out.println("FirstName:"+eachemp.getKey()+ " LastName:"+eachemp.getValue());
		}
		emp.clear();
		System.out.println(emp.isEmpty());
		System.out.println(emp.size());

	}

}
