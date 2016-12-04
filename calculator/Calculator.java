package calculator;

public class Calculator {
	
	public static void main (String [] args){
		//the next 4 lines of code runs all 4 of the methods written in this class
		additioncalculator();
		subtractioncalculator();
		multiplicationcalculator();
		divisioncalculator();
		
	}
	//addition calculator method, the next 6 lines of code are responsible for addition.
	public static void additioncalculator(){
		//the next line of code declares that the variable "x" is an integer and it is equal to the number 8.
		int x = 8;
		//the next line of code works similar to the one above, they are both require to create a sum to add together.
		int y = 2;
		//the next line of code decalres that "z" is an integer, however the value of "z" has not been written in because it acts as the placeholder for the answer to the sum of x and y.
		int z;
		//the next line of code declares that the integer "z" is in fact equal to "x" + "y".
		z = x + y;
		//the next line of code prints the entire sum including the answer; z.
		System.out.println(x + "+" + y + "=" + z);
	}
	
	//the next 3 methods work exactly the same as the method "additioncalculator" except they use different operators, subtract, multiply and divide. 
	public static void subtractioncalculator(){
		int x = 8;
		int y = 2;
		int z;
		z = x - y;
		System.out.println(x + "-" + y + "=" + z);
	}
	
	public static void multiplicationcalculator(){
		int x = 8;
		int y = 2;
		int z;
		z = x * y;
		System.out.println(x + "*" + y + "=" + z);
	}
	
	public static void divisioncalculator(){
		int x = 8;
		int y = 2;
		int z;
		z = x / y;
		System.out.println(x + "/" + y + "=" + z);
	}
}