package program_6;
//6. Working with java.lang.Float
public class part_6 {
	public static void main(String[] args) {
		/*b. Write a program to test how many bytes are used to represent a 
		 float value using the BYTES field. (Hint: Use Float.BYTES).
		
		float i = Float.BYTES;
		System.out.println(i);
		op: 4 
		
		Write a program to find the minimum and maximum values of float using the 
		MIN_VALUE and MAX_VALUE fields. (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).
		
		float i =Float.MIN_VALUE;
		float j = Float.MAX_VALUE;
		System.out.println("min value: "+i+ "max value :"+j);
		
		op: min value: 1.4E-45max value :3.4028235E38 
		
		d. Declare a method-local variable number of type float with some value and convert
		 it to a String using the toString method. (Hint: Use Float.toString(float)).
		 
		
		  float f= (float)8.9 ;
		  String str = Float.toString(f);
		  System.out.println(str);
		  
		  op: 8.9;
		  
		  e. Declare a method-local variable strNumber of type String with some value and
		   convert it to a float value using the parseFloat method. (Hint: Use Float.parseFloat(String)).
		   String strNumber = "1234";
		   float num = Float.parseFloat(strNumber);
		   System.out.println(num);
		   
		   op: 1234
		   
          f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3"
             and attempt to convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).
             String strNumber = "Ab12Cd3";
		     float r = Float.parseFloat(strNumber);
		
		op:
			Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
				
				
		g. Declare a method-local variable number of type float with some value and convert it
		 to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(float)). */
//		 float b = 678;
//		byte a = Float.valueOf(b);
//		System.out.println("Byte :" +a);
//		int f = Float.valueOf(b);
//		System.out.println("int :" +f);
//		double d = Float.valueOf(b);
//		System.out.println("double :" +d);
//	    long l = Float.valueOf(b);
//		System.out.println("long :" +l);
		
//		Type mismatch: cannot convert from Float to byte
//		Type mismatch: cannot convert from Float to int
//		Type mismatch: cannot convert from Float to long
		
//        h. Declare a method-local variable strNumber of type String with some float value and convert it
//         to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(String)).
//		String strNumber = "12.5";
//		Float f = Float.valueOf(strNumber);
//		System.out.println(f);
//		
//		op: 12.5
//        i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the
//          Float class. (Hint: Use Float.sum(float, float)).
		
//		 float a = (float)112.3;
//		 float b = (float)984.5;
//		 float sum = Float.sum(a,b);
//		 System.out.println(sum);
//		 
//		 op: 1096.8

//          j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum 
//          values using the Float class. (Hint: Use Float.min(float, float) and Float.max(float, float)).
//		 float a = (float)112.3;
//		 float b = (float)556.6;
//		 float min= Float.min(a,b);
//        float max =  Float.max(a,b);
//        System.out.println("min value is :"+min+" max value is : "+max);
//        
//        op: min value is :112.3 max value is : 556.6
//        k. Declare a float variable with the value -25.0f. Find the square root of this value.
//           (Hint: Use Math.sqrt() method).
//		float root =(float)Math.sqrt(-25.0);
//        System.out.println("square root is : "+root);	
		
		
//        l. Declare two float variables with the same value, 0.0f, and divide them.
//         (Hint: Observe the result and any special floating-point behavior).
        
//        float a = 0.0f;
//		 float b = 0.0f;
//		 float div = a/b;
//		 System.out.println(div);
//		 op: NaN
//        
//        m. Experiment with converting a float value into other primitive types or vice versa and observe
//         the results.
//           int f = (float)12.4;
//           System.out.println(f);
           //Type mismatch: cannot convert from float to int
//           float f = (int)12.4;
//           System.out.println(f);
//           op: 12.0
//          
		 
	}	


}
