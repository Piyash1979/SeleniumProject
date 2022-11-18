package collection_Map15;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Linked_HashMap {
	
	public static void main(String[] args) {
		// Maintains order of put/insert
		
		Map<String, Integer> list=new LinkedHashMap<String, Integer>();
		list.put("Books", 123);
		list.put("Pens", 123);
		list.put("Pencil", 113);
		list.put("Notebook", 133);
		list.put("Papers", 1234);
		list.put("Erazers", 223);
		list.put("Sherpners", 312);
		list.put("PostIts", 122);
		list.put("Binders", 323);
		list.put("Folders", 153);
		
		System.out.println(list.size());
        System.out.println(list.entrySet());
        
        for(Entry<String, Integer> eachlist:list.entrySet()) {
        	System.out.println(eachlist.getKey()+" "+eachlist.getValue());
        	//System.out.println(eachlist);
        	
        	list.clear();
    		System.out.println(list.isEmpty());
    		System.out.println(list.size());


        }

	}

}
