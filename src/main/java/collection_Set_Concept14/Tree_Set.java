package collection_Set_Concept14;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		// Maintain Ascending order output
		
		/*Set<String> emp=new TreeSet<String>();
		emp.add("Amal");
		emp.add("Based");
		emp.add("Dolly");	
		emp.add("Frunky");
		emp.add("Gomeg");
		emp.add("pamel");
		emp.add("Sharmin");
		System.out.println(emp.size());
		
		//print/display all items in the Set -using forEach loop
		for(String eachemp: emp) {
			System.out.println(eachemp);
		}*/
		Set<Integer>obj=new TreeSet<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		obj.add(700);
		obj.add(800);
		obj.add(900);
		System.out.println(obj.size());
		
		for(Integer eachobj:obj) {
			System.out.println(eachobj);
		}


	System.out.println(	obj.contains(120));
	obj.clear();
	System.out.println(obj.isEmpty());
	
		


	}

}
