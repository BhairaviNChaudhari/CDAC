import java.util.Scanner;
class Day2 {
	public static void main(String args[])
	{
/*	Leap Year using IF_ELSE:
 	Scanner sc = new Scanner(System.in);
		System.out.println("enter the year : ");
		int a = sc.nextInt();
        if ((a%4==0) && (a%100!=0 )||(a%400==0))
        	System.out.println("Year is leap year");
        else
        	System.out.println("Year is not a leap year");

Leap Year using Switch case:

	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the year: ");
	int a = sc.nextInt();
	int result=0;
	if(a%4==0 && a%100!=0)
	{
		result = 1;
	}
	else if(a%400==0)
	{
		result = 2;
	}
	else if(a%100==0 && a%400!=0)
	{
		result = 3;
	}
	else if(a%100==0 && a%4!=0)
	{
		result = 4;
	}
	
	
	switch(result) {
	case 1:
		System.out.println(a+ " is a leap year.");
		
	case 2:
		System.out.println(a+ " is a leap year and century..!!!");
		break;
	case 3:	
		System.out.println(a+ "Year is not leap But Century..!");
		break;
	case 4:	
		System.out.println(a+ "Not a leap year");
		break;
	default :
		System.out.println(a+ " invalid year entered");
	}
	
	
2	BMI Calculation:               
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight into kg :");
		float weight = sc.nextFloat();
		System.out.println("Enter the height into meter :");
		float height = sc.nextFloat();
		
		float BMI = weight/(height * height);
		
		System.out.println("BMI = : " +BMI+ " kg/m");
		if (BMI < 18.5)
			System.out.println("You Are Underweignt :( ");
			
		else if (BMI>18.5 && BMI<24.9)
			System.out.println("You Are Normal-Weighted :) ");
		
		else if (BMI>=25)
			System.out.println("You Are over-weignt :( ");
 
 
 3: Check whether the person eligible for voting or not:
 
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age of the person:");
int age = sc.nextInt();
if (age<=18)
System.out.println("Person is not eligible age to vote");
else
System.out.println("Person is eligible to vote");	

4.Write a program that takes a month (1-12)Write a program that takes a month (1-12) 
and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case 
	
Scanner sc = new Scanner(System.in);
int s;
System.out.println("Enter the month ");
int m = sc.nextInt();
switch (m)
{
case 1: System.out.println(" Jan ");break;
case 2: System.out.println(" Feb ");break;
case 3: System.out.println(" Mar ");break;
case 4: System.out.println(" April ");break;
case 5: System.out.println(" May ");break;
case 6: System.out.println(" June ");break;
case 7: System.out.println(" July ");break;
case 8: System.out.println(" Aug ");break;
case 9: System.out.println(" Sept ");break;
case 10: System.out.println(" Oct ");break;
case 11: System.out.println(" Nov ");break;
case 12: System.out.println(" Dec ");break;
default:System.out.println("Wrong month chosen ");

}

if(m>=3 && m<=5)
	System.out.println("Spring");

else if(m>=6 && m<=8)
	System.out.println("Summer");
else if(m>=9 && m<=11)
	System.out.println("Autumn");
else 
	System.out.println("winter");

5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle)
and then calculates the area based on user-provided dimensions using a switch case.


*/	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of Shapes: ");
		System.out.println("1.CIRCLE \n2.SQUARE \n3.RECTANGLE \n4.TRIANGLE ");
		System.out.println("Enter the Choice ");
		int m = sc.nextInt();
        switch(m)
        {
        case 1:
        	System.out.println("Enter the radius: ");
        	 float r = sc.nextFloat();
        	double circle = 3.14*(r*r);
        			System.out.println("Area of circle = " +circle);
        	break;
        case 2:
        	System.out.println("Enter the side length of square: ");
        	float s = sc.nextFloat();
        	float square = s*s;
        	System.out.println("Area of square = " +square);
        	break;
        case 3:
        	System.out.println("Enter the height and width of the Rectangle: ");
        	float l = sc.nextFloat();
        	float b = sc.nextFloat();
        	float rectangle = l*b;
        	System.out.println("Area of rectangle = " +rectangle);
        	break;
        case 4:
        	System.out.println("Enter the base and height of the triangle: ");
        	float h = sc.nextFloat();
        	float base = sc.nextFloat();
        	float triangle = 1/2*(base*h);
        	System.out.println("Area of triangle = " +triangle);
        	break;
        default:
        
        }

}
}