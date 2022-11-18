package collection_Set_Concept14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {

	public static void main(String[] args) {
		// maintains inserting order
		
		Set<String>day=new LinkedHashSet<String>();
		
		//1. add item in the Set -use add()
		day.add("Saturday");
		day.add("Sunday");
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("weekday");
		//Get count of Set - use size()
		System.out.println(day.size());
		
		//3.print all items in the Set -use foreach loop
		for(String eachday:day) {
			System.out.println(eachday);
		}
		
		//4.Check particular item from set: Use contains();
		System.out.println(day.contains("holiday"));
		
		//5.To delete item from Set: Use remove(item)
		day.remove("weekday");
		System.out.println(day.contains("weekday"));
		
		//After delete  print all item from set
		for(String eachday: day) {
			System.out.println(eachday);
		}
	
 
		//6.To delete all item from the set: use clear()
		day.clear();
		
		//7.To confirm set is empty or not: use isEmpty()
		System.out.println(day.isEmpty());
		
		System.out.println(day.size());

	}

	
	}	


