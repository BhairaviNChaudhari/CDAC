package Program_2;
// 2. Working with java.lang.Byte
class part_2 {
	public static void main(String args[]) {
		/*
		b. Write a program to test how many bytes are used
		to represent a byte value using the BYTES field. (Hint: Use Byte.BYTES).
		byte byteSize = Byte.BYTES;
        System.out.println("Number of bytes used to represent a byte value: " + byteSize);
        op : Number of bytes used to represent a byte value: 1 
		
		c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE 
		and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
		byte maxsize = Byte.MAX_VALUE;
		byte minsize = Byte.MIN_VALUE;
		System.out.println("max size if byte is:"+maxsize+" Min value of byte is :"+minsize);
		max size if byte is:127 Min value of byte is :-128
		
		d. Declare a method-local variable number of type byte with some value and convert it 
		to a String using the toString method. (Hint: Use Byte.toString(byte)).
		
		Byte number = 123;
		String d = Byte.toString(number);
		System.out.println("String is : "+d);
		String is : 123
		
		e .e. Declare a method-local variable strNumber of type String with some 
		value and convert it to a byte value using the parseByte method. 
		(Hint: Use Byte.parseByte(String)).
		
		String strNumber = "32";
		Byte b = Byte.parseByte(strNumber);
		System.out.println("byte : " +b);
		op : byte : 32
		
		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
		and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).
		 String strNumber = "Ab12Cd3";
		 Byte b = Byte.parseByte(strNumber);
		 at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:662)
			at java.base/java.lang.Byte.parseByte(Byte.java:195)
			at java.base/java.lang.Byte.parseByte(Byte.java:221)
			at Program_2.part_2.main(part_2.java:39)
			
		g. Declare a method-local variable number of type byte with some value and convert it 
		to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).
		
		Byte b = 123;
		int a = Byte.valueOf(b);
		System.out.println("int :" +a);
		float f = Byte.valueOf(b);
		System.out.println("float :" +f);
		double d = Byte.valueOf(b);
		System.out.println("double :" +d);
		long l = Byte.valueOf(b);
		System.out.println("long :" +l);
		
		op: int :123
		int :123.0
		int :123.0
		int :123
		
		h. Declare a method-local variable strNumber of type String with some byte 
		value and convert it to  the corresponding wrapper class using 
		Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
 		
		String strNumber = "19";
		Byte b = Byte.valueOf(strNumber);
		System.out.println("byte value of string " +b);
		
		op:
			byte value of string 19 
		
		i. Experiment with converting a byte value into other primitive 
		types or vice versa and observe the results.
		byte b = 120;
		int a = Byte.valueOf(b);
		System.out.println("int :" +a);
		float f = Byte.valueOf(b);
		System.out.println("float :" +f);
		double d = Byte.valueOf(b);
		System.out.println("double :" +d);
		long l = Byte.valueOf(b);
		System.out.println("long :" +l);
		//Byte is not converted into int float double and long
		
	}

}
		*/