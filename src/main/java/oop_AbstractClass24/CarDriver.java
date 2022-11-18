package oop_AbstractClass24;

//its a fully abstract class.It has no abstract method
public abstract class CarDriver {
	
	void drive() {//this is non abstract method. It has implementation
		System.out.println("Driver can drive the car");
		
		
	}
	
//After adding drive(), it's not a fully abstract
	
	abstract void passengerLoadUnload();//This is fullyn abstract
}
