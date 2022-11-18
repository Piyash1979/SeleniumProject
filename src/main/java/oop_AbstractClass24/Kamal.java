package oop_AbstractClass24;

public class Kamal extends CarDriver{

	
	//drive(),passengerLoadUnload() both method internally came here for inheritance concept
	
	@Override
	void passengerLoadUnload() {
		System.out.println("Kamal Can loadunload passenger too");
	}
}
