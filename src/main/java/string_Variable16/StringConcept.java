package string_Variable16;

public class StringConcept {

	public static void main(java.lang.String[] args) {

		
		String text="String Concept";
		String text1="String Concept";
		
		//Find the memory location/ address of this tex/text1 variable
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		//String class method
		//1.equals() return true or false
		System.out.println(text);
		System.out.println(text1);
		
		//2.Length() return count of string
		System.out.println(text.equals(text1));
		String text2="Learning String";
		System.out.println(text2.length());
		
		//3.concat()if we want to Concat(joinmore than one strings) two string
		System.out.println(text.concat(text2));
		
		//for concating different datatype variable we use +
		String num="20";
		String num1="30";
		int a=10;
		int b=20;
		System.out.println(num +a);
		System.out.println(num1 +b);
		System.out.println(a+b);
		
		//4.Trim() want to remove white space from both side of string use trim()
		String line= "    Dhaka is the capital of Bangladesh    ";
		System.out.println(line.trim());
		
		//5.toLowerCase()-Convert all of the String as LowerCase()
		String text3="Convert all of the String as Lower/upper case";
		System.out.println(text3.toLowerCase());
		System.out.println(text3.toUpperCase());
		
		//6.Contains()- given string as a available in entire string or not - return true/false
		System.out.println(text.contains("pare"));
		
		
		
		

	}

}
