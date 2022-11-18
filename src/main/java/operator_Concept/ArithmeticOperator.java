package operator_Concept;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {

		/*Scanner input=new Scanner(System.in);
	    int num1, num2, result;


		System.out.println("Enter First number:");
		
		num1=input.nextInt();
		
		System.out.println("Enter second number:");
		num2=input.nextInt();*/
	

		
		int num1,num2,result;
		num1=20;
		num2=10;
		
		result=num1+num2;
		System.out.println("sum =" +result);
		
		result=num1-num2;
		System.out.println("sub ="+result);

		result=num1*num2;
		System.out.println("multiplication="+result);

		result=num1/num2;
		System.out.println("Div="+result);

		result=num1%num2;
		System.out.println("Remainder="+result);
		
	
	}

}
