package Program_4;
//Working with java.lang.Integer
public class part_4 {
	public static void main(String args[]) {
	/*  B. Write a program to test how many bytes
	 *  are used to represent an int value using the BYTES field. 
	 *  (Hint: Use Integer.BYTES).
		Integer i = Integer.BYTES;
		System.out.println(+i);
		op: 4 
		
		
		C. Write a program to find the minimum and maximum values of int using the 
		MIN_VALUE and MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).
		Integer i =Integer.MIN_VALUE;
		Integer j = Integer.MAX_VALUE;
		System.out.println("min value: "+i+ "max value :"+j);
		
		op:min value: -2147483648max value :2147483647
		
		D. Declare a method-local variable number of type int with some value and convert it to 
		a String using the toString method. (Hint: Use Integer.toString(int)).
		
		int i=20;
		String s = Integer.toString(i);
		System.out.println(s);
		
		op: 20
		
		E. Declare a method-local variable strNumber of type String with some value and convert it 
		to an int value using the parseInt method. (Hint: Use Integer.parseInt(String)).
		
		String strNumber = "1234";
		int num = Integer.parseInt(strNumber);
		System.out.println(num);
		
		op: 1234
		
		F.Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and 
		attempt to convert it to an int value. (Hint: parseInt method will 
		throw a NumberFormatException).
		String strNumber = "Ab12Cd3";
		int r = Integer.parseInt(strNumber);
		
		op:
			Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
				at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
				at java.base/java.lang.Integer.parseInt(Integer.java:662)
				at java.base/java.lang.Integer.parseInt(Integer.java:778)
				at Program_4.part_4.main(part_4.java:43)
				
		G.Declare a method-local variable number of type int with some value and convert it to the corresponding
		wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).
		int b = 12376;
		//byte a = Integer.valueOf(b);
		//System.out.println("Byte :" +a);
		float f = Integer.valueOf(b);
		System.out.println("float :" +f);
		double d = Integer.valueOf(b);
		System.out.println("double :" +d);
		long l = Integer.valueOf(b);
		System.out.println("long :" +l);
		
		//op:
		//Type mismatch: cannot convert from Integer to byte
	    //another op:
		float :12376.0
		double :12376.0
		long :12376 
		
		h. Declare a method-local variable strNumber of type String with some integer value and convert it to the 
		corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).
        
	String s="223";
	Integer g = Integer.valueOf(s);
	System.out.println(g);
	
	op: 223
	
		i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. 
		(Hint: Use Integer.sum(int, int)). 
		int i = 10;
		int j = 20;
		Integer s = Integer.sum(i, j);
		System.out.println(s);
		
		op: 30
		
		
		j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the 
		Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int, int)).
	    int i = 10;
		int j = 20;
		Integer s = Integer.max(i, j);
		System.out.println(s);
	
	    op: 20
		
		k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using
		methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and 
	    Integer.toHexString(int)).
		int i = 7;
		String b = Integer.toBinaryString(i);
		System.out.println("binary: " +b);
		String o = Integer.toOctalString(i);
		System.out.println("Octal : " +o);
		String h = Integer.toHexString(i);
		System.out.println("Hex : " +h);
        
		op:
		binary: 111
		Octal : 7
		Hex : 7 
		l. Experiment with converting an int value into other primitive types or vice versa
		and observe the results.*/
		int b = 120;
		//byte a = Integer.valueOf(b);
		//System.out.println("Byte :" +a);
		float f = Integer.valueOf(b);
		System.out.println("float :" +f);
		double d = Integer.valueOf(b);
		System.out.println("double :" +d);
		long l = Integer.valueOf(b);
		System.out.println("long :" +l);
		
	    int q = (int) 12.5 ;
	    System.out.println(q);
	    
	    int j = (int) 111.6789;
	    System.out.println(j);	
	    
	    op:
		    float :120.0
		    double :120.0
		    long :120
		    12
		    111

		
	    
		
		
	}
}
