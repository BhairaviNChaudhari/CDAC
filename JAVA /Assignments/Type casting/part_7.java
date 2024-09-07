package program_7;

//Working with java.lang.Double
public class part_7 {
	public static void main(String[] args) {

//		b. Write a program to test how many bytes are used to represent a double value using the BYTES field.
//		(Hint: Use Double.BYTES).
//		
//		double i = Double.BYTES;
//		System.out.println(i);
//	  op: 8.0

//		c. Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE 
//		fields. (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).

//		double i =Float.MIN_VALUE;
//		double j = Float.MAX_VALUE;
//		System.out.println("min value: "+i+ "max value :"+j);
//	op: min value: 1.401298464324817E-45max value :3.4028234663852886E38

//		d. Declare a method-local variable number of type double with some value and convert it to a String using the
//		toString method. (Hint: Use Double.toString(double)).
//		  double f= 3.86478469 ;
//		  String str = Double.toString(f);
//		  System.out.println(str);
//		  
//		  op: 3.86478469
//		  
//		e. Declare a method-local variable strNumber of type String with some value and convert it to a double value 
//		using the parseDouble method. (Hint: Use Double.parseDouble(String)).
//		  String strNumber = "1234";
//		   Double num = Double.parseDouble(strNumber);
//		   System.out.println(num);
//		   
//		   op:  1234.0
//		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it 
//		to a double value. (Hint: parseDouble method will throw a NumberFormatException).

//		 String strNumber = "Ab12Cd3";
//	     Double r = Double.parseDouble(strNumber);
//	     
//	     op: Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
//	    	 
//		g. Declare a method-local variable number of type double with some value and convert it to the corresponding
//		wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).
//		double b = 12.34;
//        byte a = Double.valueOf(b);
//		System.out.println("Byte :" +a);
//		int f = Double.valueOf(b);
//		System.out.println("int :" +f);
//		doubled = Double.valueOf(b);
//		System.out.println("double:" +d);
//	    long l = Double.valueOf(b);
//		System.out.println("long :" +l);
//		Type mismatch: cannot convert from Double to byte
//		Type mismatch: cannot convert from Double to int
//		Type mismatch: cannot convert from Double to float
//		Type mismatch: cannot convert from Double to long

//		h. Declare a method-local variable strNumber of type String with some double value and convert it to the 
//		corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).
//		String strNumber = "12.57";
//		Double f = Double.valueOf(strNumber);
//		System.out.println(f);

//		op: 12.57
//		i. Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class. 
		// (Hint: Use Double.sum(double, double)).

//		  double a =112.3;
//		 double b = 984.5;
//		 double sum = Double.sum(a,b);
//		 System.out.println(sum);
//		 
//		 op: 1096.8
//		 
//		j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using 
//		the Double class. (Hint: Use Double.min(double, double) and Double.max(double, double)).

//		double a =  112.3;
//		double b =  556.6;
//		double min = Double.min(a, b);
//		double max = Double.max(a, b);
//		System.out.println("min value is :" + min + " max value is : " + max);
//		op:min value is :112.3 max value is : 556.6
		
//		k. Declare a double variable with the value -25.0. Find the square root of this value. (Hint: Use Math.sqrt()
//				method).
//		double root =Math.sqrt(-25.0);
//      System.out.println("square root is : "+root);	
//      square root is : NaN
//		
//		l. Declare two double variables with the same value, 0.0, and divide them. (Hint: Observe the result and any 
//				special floating-point behavior).
		double a = 0.0f;
//		double b = 0.0f;
//		 double div = a/b;
//		 System.out.println(div);
//		 op: NaN
//      
          
//		

	}

}
