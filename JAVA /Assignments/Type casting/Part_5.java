package program_5;
import java.util*;

//5. Working with java.lang.Long
public class Part_5 {
	public static void main(String args[])
	{
		/*
		b. Write a program to test how many bytes are used to represent a 
		long value using the BYTES field. (Hint: Use Long.BYTES).
		long l = Long.BYTES;
		System.out.println(+l);
		
		op: 8
		
		c. Write a program to find the minimum and maximum values of long using 
		the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
		
		long i =Long.MIN_VALUE;
		long j =Long.MAX_VALUE;
		System.out.println("min value: "+i+ " max value :"+j);
		op: min value: -9223372036854775808 max value :9223372036854775807
		
		d. Declare a method-local variable number of type long with some value and convert it 
		to a String using the toString method. (Hint: Use Long.toString(long)).
		
		long i=40;
		String s = Long.toString(i);
		System.out.println(s);
		
		op: 40
		
		e. Declare a method-local variable strNumber of type String with some value and convert 
		it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).
		
		String strNumber = "49";
		Long num = Long.parseLong(strNumber);
		System.out.println(num);
		
		
		op: 49
		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to 
		convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).
		
		
		String strNumber = "Ab12Cd3";
		Long r = Long.parseLong(strNumber);
		op:
			Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
				at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
				at java.base/java.lang.Long.parseLong(Long.java:709)
				at java.base/java.lang.Long.parseLong(Long.java:832)
				at program_5.Part_5.main(Part_5.java:45)   
				
		g. Declare a method-local variable number of type long with some value and convert it to the corresponding
		wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).
		
		long b = 678;
		//byte a = Long.valueOf(b);
		//System.out.println("Byte :" +a);
		float f = Long.valueOf(b);
		System.out.println("float :" +f);
		double d = Long.valueOf(b);
		System.out.println("double :" +d);
	    //int l = Long.valueOf(b);
		//System.out.println("int :" +l);
		
		op:
			Type mismatch: cannot convert from Long to int
			float :678.0
			double :678.0 
		
			h. Declare a method-local variable strNumber of type String with some long value and convert it to the 
			corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).
			
			 
		String s="987";
		Long g = Long.valueOf(s);
		System.out.println(g);
		
		op: 987
		
		i. Declare two long variables with values 1123 and 9845, and add them using a 
		method from the Long class. (Hint: Use Long.sum(long, long)).
		long i = 1123;
		int j = 9845;
		Long s = Long.sum(i, j);
		System.out.println(s);
		
		op: 10968 
		
		j. Declare two long variables with values 1122 and 5566, and find the minimum 
		and maximum values using the Long class. (Hint: Use Long.min(long, long) and 
				Long.max(long, long)).
	    long i = 1122;
		long j = 5566;
		long s = Long.max(i, j);
		System.out.println(s);
		
		op: 5566
		
	    k. Declare a long variable with the value 7. Convert it to binary, octal, and 
		hexadecimal strings using methods from the Long class. (Hint: Use Long.toBinaryString(long), 
		Long.toOctalString(long), and Long.toHexString(long)).
		
		long l =7;
		String b = Long.toBinaryString(l);
		System.out.println("binary: " +b);
		String o = Long.toOctalString(l);
		System.out.println("Octal : " +o);
		String h = Long.toHexString(l);
		System.out.println("Hex : " +h);
        
			op:
				binary: 111
				Octal : 7
				Hex : 7
		l. Experiment with converting a long value into other primitive types or vice versa and
		observe the results. */
		
		
		
		
	}

}
