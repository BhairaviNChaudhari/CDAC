package program_8;

import java.util.Scanner;
import java.io.*;

public class Part_8 {

	public static void main(String args[]) {
		/*
		 * Conversion between Primitive Types and Strings Initialize a variable of each
		 * primitive type with a user-defined value and convert it into String: o First,
		 * use the toString method of the corresponding wrapper class. (e.g.,
		 * Integer.toString()). o Then, use the valueOf method of the String class.
		 * (e.g., String.valueOf()).*/
 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter a boolean: ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter a long: ");
        long l = sc.nextLong();

        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        System.out.print("Enter a byte: ");
        byte a = sc.nextByte();

        // Convert to String using toString() method of wrapper class
        String intToString = Integer.toString(n);
        String floatToString = Float.toString(f);
        String doubleToString = Double.toString(d);
        String charToString = Character.toString(ch);
        String booleanToString = Boolean.toString(b);
        String longToString = Long.toString(l);
        String shortToString = Short.toString(s);
        String byteToString = Byte.toString(a);

        // Convert to String using String.valueOf() method
        String intToStringValueOf = String.valueOf(n);
        String floatToStringValueOf = String.valueOf(f);
        String doubleToStringValueOf = String.valueOf(d);
        String charToStringValueOf = String.valueOf(ch);
        String booleanToStringValueOf = String.valueOf(b);
        String longToStringValueOf = String.valueOf(l);
        String shortToStringValueOf = String.valueOf(s);
        String byteToStringValueOf = String.valueOf(a);

        System.out.println("Using toString() method:");
        System.out.println("int: " + intToString);
        System.out.println("float: " + floatToString);
        System.out.println("double: " + doubleToString);
        System.out.println("char: " + charToString);
        System.out.println("boolean: " + booleanToString);
        System.out.println("long: " + longToString);
        System.out.println("short: " + shortToString);
        System.out.println("byte: " + byteToString);
        
        System.out.println("********");

        System.out.println("Using String.valueOf() method:");
        System.out.println("int: " + intToStringValueOf);
        System.out.println("float: " + floatToStringValueOf);
        System.out.println("double: " + doubleToStringValueOf);
        System.out.println("char: " + charToStringValueOf);
        System.out.println("boolean: " + booleanToStringValueOf);
        System.out.println("long: " + longToStringValueOf);
        System.out.println("short: " + shortToStringValueOf);
        System.out.println("byte: " + byteToStringValueOf);

        sc.close();
        
        op: Enter an integer: 5678
        Enter a float: 1.34
        Enter a double:  1.546
        Enter a character:  g
        Enter a boolean:  false
        Enter a long:  45924
        Enter a short:  45
        Enter a byte:  12
        Using toString() method:
        int: 5678
        float: 1.34
        double: 1.546
        char: g
        boolean: false
        long: 45924
        short: 45
        byte: 12
        ********
        Using String.valueOf() method:
        int: 5678
        float: 1.34
        double: 1.546
        char: g
        boolean: false
        long: 45924
        short: 45
        byte: 12

        /*
		 * 9. Default Values of Primitive Types Declare variables of each primitive type
		 * as fields of a class and check their default values. (Note: Default values
		 * depend on whether the variables are instance variables or static variables).
		 *
		 * 
		 * 
		 * 
		 * public class Part_8{
		 *  static int i;
		 *  static float f; 
		 *  static double d;
		 *  static boolean b;
		 *  static long l;
		 *  static byte y;
		 *
		 * public static void main(String args[]) {
		 * System.out.println(" int :"+i+" float : "+f+" double : "+d+" boolean "
		 * +b+" long "+l+" byte: "+b);}}
		 * 
		 * op: int :0 float : 0.0 double : 0.0 boolean false long 0 byte: false.
		 * 
		 * 10. Arithmetic Operations with Command Line Input Write a program that
		 * accepts two integers and an arithmetic operator (+, -, *, /) from the command
		 * line. Perform the specified arithmetic operation based on the operator
		 * provided. (Hint: Use switch-case for operations).
		 */public class Program {
        	public static void main(String[] args) {
        		if (args.length != 3) {
                    System.out.println("Usage: java Program <n1> <operator> <n2>");
                    return;
                }
                int n1 = Integer.parseInt(args[0]);
                char operator = args[1].charAt(0);
                int n2 = Integer.parseInt(args[2]);
                
                int res;
                switch (operator) {
                    case '+':
                        res = n1 + n2;
                        System.out.println("Result: " + res);
                        break;
                    case '-':
                        res = n1 - n2;
                        System.out.println("Result: " + res);
                        break;
                    case '*':
                        res = n1 * n2;
                        System.out.println("Result: " + res);
                        break;
                    case '/':
                        if (n2 != 0) {
                            res = n1 / n2;
                            System.out.println("Result: " + res);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                }

           	}

        }
        
	}

}
