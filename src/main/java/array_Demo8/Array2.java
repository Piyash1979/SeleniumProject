package array_Demo8;

import controlStatement.While_Loop;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

//import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		
    	String []name=new String[6];
    	
    	name[0]="Koli";
    	name[1]="Moli";
    	name[2]="Doli";
    	name[3]="Poli";
    	name[4]="Toli";
    	name[5]="Joli";

    	for(int i=0; i<name.length;i=i+1) {
    		
        	System.out.print("Employees name:  ");


        	System.out.println(name[i]);
        }

    	//System.out.println("Employees name are" + name[i]);
    	
   	
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
	     int[] number= new int [5];

	       /* number[0]= 1;
	        number[1]= 2;
	        number[2]= 3;
	        number[3]= 4;
	        number[4]= 5;*/
	        
	       int sum=0;
	        sum=number[0]+ number[1]+ number[2]+ number[3]+ number[4];
            System.out.println(sum);
	        
	       //for(int i=0;i<5; i++) {
	       for(int i=0; i<number.length;i++) {
	        	number[i]=i+1;
	        	
	        	System.out.println(sum);

	    		sum= sum+ number[i];//sum=0+1;1+2;3+3;6+4;10+5
	    	}
        	System.out.println("The sum is :"+sum);
        	
        	//System.out.println("The average is :"+sum/5);
           int avg=sum/number.length;
       	System.out.println("The average is :"+avg);

           
        	System.out.println("**************************************************");
        	
        	int age=18;
        	if(age<=18) {
        		System.out.println("Elegible for vote");
        		
        	}else if(age>=18) {
        		System.out.println("Not elegible for vote");

        		
        	}else
        		System.out.println("Under age");
        	
        	
    		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        	
        	//while loop
        	int i=0;
        	while (i<=3) {
        		System.out.println(name[i]);
        		i++;
        	}
        	
        	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        	
        	//do while loop
        	int j=0;
        	do {
            	System.out.println(name[j] +" Is a student");
        		j++;
        	}
        	//while(j<=10);
        	while(j<=5);
	

        	System.out.println("##################################################");
        	
        	
        	
	      //for each loop
         for(String eachNames: name) {
        	 System.out.println(eachNames +" Is an employee of the month");
         }
        	 
         }

}

