package collections_ListConcept13;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>id=new ArrayList<Integer>();
		id.add(20);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		id.add(60);
		id.add(70);
		id.add(200);
		System.out.println(id);
		System.out.println("Adding :"+id.add(100));
		System.out.println("Containing :" +id.contains(100));
		System.out.println("Removing one item:"+id.remove(7));
		System.out.println("The size is :"+id.size());
		
		for(int i=0;i<id.size();i++) {
			System.out.println(id.get(i));
		}
		for(int num: id) {
		System.out.println(num);	
		
		}
		
System.out.println("To get item: "+id.get(4));
         id.clear();
System.out.println("To clear id:");
System.out.println("ID is empty: "+id.isEmpty());

	

	
	/*
	List<String> nm= new ArrayList<String>();
	
    nm.add("Koli");
    nm.add("Moli");
    nm.add("Poli");
    nm.add("Toli");
    nm.add("Doli");
    nm.add("Doli");
    nm.add("Koli");
    nm.add("joli");

System.out.println(nm);
for(String name:nm) {
	System.out.println(name);
}
nm.clear();
nm.isEmpty();*/
	
	}
}
