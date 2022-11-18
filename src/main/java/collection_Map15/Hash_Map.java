package collection_Map15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class Hash_Map {

	public static void main(String[] args) {
		// Maintains random order
		 
		Map<String, Integer>st=new HashMap<String, Integer>();
		st.put("Mark", 123);
		st.put("Max", 124);
		st.put("Maria", 223);
		st.put("Mary", 113);
		st.put("Carl", 133);
		st.put("Cavin", 124);
		st.put("Jeren", 523);
		st.put("Franko", 623);
		 //get count of map entry-size
		st.size();
		System.out.println(st.size());
		//To get
		System.out.println(st.get("Mark"));
		//
		System.out.println(st.entrySet());
		//Remove a particular item
		System.out.println(st.remove("Carl", 133));
		//Contains()
		System.out.println(st.containsKey("Calvin"));
		System.out.println(st.containsKey(623));
		
		for(Entry<String, Integer> eachst:st.entrySet()) {
			System.out.println(eachst);
			
		}
		
		st.clear();
		System.out.println(st.isEmpty());
		System.out.println(st.size());

		st.put("Keya", 345);
		st.put("Maya", 445);
		st.put("Shia", 545);
		st.put("Nila", 645);
		st.put("Keya", 745);
		System.out.println(st.entrySet());

	}

}
