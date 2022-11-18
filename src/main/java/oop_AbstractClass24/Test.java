package oop_AbstractClass24;

public class Test {

	public static void main(String[] args) {
		
		//we can't create object of Abstract class; but we can create referenceVeriable;
		
		//CaarDriver cd =new CarDriver();
		
		//Syntax Of referanceVeriable: ClassName(SuperCllass)referanceVeriable;
		CarDriver cd;//reference variable of superClass
		cd=new Jamal();
		cd.passengerLoadUnload();
		
	    cd.drive();
	    
	    cd=new Kamal();
	    cd.drive();
	    cd.passengerLoadUnload();
	}

}
