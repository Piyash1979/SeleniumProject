package javaDemo;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
    /* 
		System.out.println("      |");
		System.out.println("    / |");
		System.out.println("   /  |");
		System.out.println("  /   |");
		System.out.println(" /    |");
		System.out.println("/_____|");*/




		String firstName,lastName; int age;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first name");
		firstName=input.nextLine();
		
		System.out.println("Enter last name");
		lastName=input.next();
		
		System.out.println("Enter age");
		age=input.nextInt();

		System.out.println("Hello "+ firstName + lastName + " you are" + age + "year old!");
	}
		
		
	}


