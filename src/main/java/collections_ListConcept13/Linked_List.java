package collections_ListConcept13;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {

		
		List<Double>num =new LinkedList<Double>();
		num.add(23.4);
		num.add(33.4);
		num.add(73.4);
		num.add(23.8);
		num.add(29.4);
		num.add(53.6);
		num.add(33.4);
		System.out.println(num.size());
		
		for(Double eachnum:num) {
			System.out.println(eachnum);
		}

		
		num.remove(33.4);
		System.out.println(num.remove(33.4));
		System.out.println(num.contains(34.7));
		num.clear();
		System.out.println(num.isEmpty());
		System.out.println(num.size());
		num.isEmpty();
	}

}
