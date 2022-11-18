package collection_Set_Concept14;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Concept {

	public static void main(String[] args) {

		//Generate Random output/not maintain order
		
		Set<Integer> obj=new HashSet<Integer>();
		obj.add(120);
		obj.add(130);

		obj.add(100);
		obj.add(129);
		obj.add(1200);
		obj.add(145);
		obj.add(190);
		obj.add(100);
		System.out.println(obj);
		System.out.println("Adding :"+obj.add(1000));
		System.out.println("Containing :" +obj.contains(123));
		System.out.println("Removing one item:"+obj.remove(7));
		System.out.println("The size is :"+obj.size());
		
		obj.clear();
		obj.isEmpty();
	}

}
