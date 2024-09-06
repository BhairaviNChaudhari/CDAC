package Program_3;

//3. Working with java.lang.Short
public class part_3 {
	public static void main(String args[]) {
		
	/*	b. Write a program to test how many bytes are used to represent a short value
		using the BYTES field. (Hint: Use Short.BYTES).
		Short s = Short.BYTES;
	    System.out.println(" "+s);
	    2 
		c. Write a program to find the minimum and maximum values of short using the 
		MIN_VALUE and MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).
		short a = Short.MIN_VALUE;
		short b = Short.MAX_VALUE;
		System.out.println("min value:  "+a+" max value: "+b);
		min value:  -32768 max value: 32767
		
		d. Declare a method-local variable number of type short with some value 
		and convert it to a String using the toString method. (Hint: Use 
		Short.toString(short)).
		Short number = 1223;
		String d = Short.toString(number);
		System.out.println("String is : "+d);
		String is : 1223
		
		e. Declare a method-local variable strNumber of type String with some 
		value and convert it to a short value using the parseShort method.
		 (Hint: Use Short.parseShort(String)).
		 
		 String strNumber = "332";
		Byte b = Short.parseShort(strNumber);
		System.out.println("Short : " +b);
		op : byte : 332
		
		f. Declare a method-local variable strNumber of type String with the value 
		"Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort
		 method will throw a NumberFormatException).
		 
		  String strNumber = "Ab12Cd3";
		 Short b = Short.parseShort(strNumber);
		 at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:662)
			at java.base/java.lang.Short.parseByte(Byte.java:195)
			at java.base/java.lang.Short.parseByte(Byte.java:221)
			at Program_2.part_2.main(part_2.java:39)
			
		g. Declare a method-local variable number of type short with some
		 value and convert it to the corresponding wrapper class using Short.valueOf().
		  (Hint: Use Short.valueOf(short)).
		Short b = 1290;
		  int a = Short.valueOf(b);
		System.out.println("int :" +a);
		float f = Short.valueOf(b);
		System.out.println("float :" +f);
		double d = Short.valueOf(b);
		System.out.println("double :" +d);
		long l = Short.valueOf(b);
		System.out.println("long :" +l);
		

		
        	int :1290
        	float :1290.0
        	double :1290.0
        	long :1290
		
		h. Declare a method-local variable strNumber of type String with 
		some short value and convert it to the corresponding wrapper class using 
		Short.valueOf(). (Hint: Use Short.valueOf(String)).
		String strNumber = "19";
		Short b = Short.valueOf(strNumber);
		System.out.println("Short value of string " +b);
		
		op:
			Short value of string 19
		
		i. Experiment with converting a short value into other primitive types
		or vice versa and observe the results.
		Short b = 1290;
		  int a = Short.valueOf(b);
		System.out.println("int :" +a);
		float f = Short.valueOf(b);
		System.out.println("float :" +f);
		double d = Short.valueOf(b);
		System.out.println("double :" +d);
		long l = Short.valueOf(b);
		System.out.println("long :" +l);
		short number = 123;
        Short numberWrapper = Short.valueOf(number);
        System.out.println("Primitive short: " + number);
        System.out.println("Wrapper Short: " + numberWrapper);
        op:
        	int :1290
        	float :1290.0
        	double :1290.0
        	long :1290
        Primitive short: 123
        	Wrapper Short: 123 */
        	
	}

}
		