Two For Loop Pattern:
class Pattern {
 public static void main(String Args[])
 /*
  
  {
	for(int r=1; r<=5 ; r++)
	{
		for(int c=1; c<=r; c++)
		{
			System.out.print("*");  //printing *
	     }
		System.out.println();
	}
 }
}

*
**
***
****
*****
 {
		for(int r=5; r>=0 ; r--)
		{
			for(int c=0; c<=r; c++)
			{
				System.out.print("*" ); //rows in pattern
		     }
			System.out.println("");
		}
}
}
******
*****
****
***
**
*


 {
		for(int r=1; r<=5 ; r++)
		{
			for(int c=1; c<=5; c++)
			{
				System.out.print("*");    //Printing *
		     }
			System.out.println();
		}
}
}

*****
*****
*****
*****
*****
 
 {
		for(int r=0; r<=5 ; r++)
		{
			for(int c=1; c<=5; c++)
			{
				System.out.print(r+1+"" );    //Printing value of r+1
		     }
			System.out.println();
		}
}
}
 
11111
22222
33333
44444
55555
66666
 
 {
		for(int r=0; r<=5 ; r++)
		{
			for(int c=1; c<=5; c++)
			{
				System.out.print(c+"" );     //Printing value of column
		     }
			System.out.println();
		}
}
}

12345
12345
12345
12345
12345
12345

 {
		for(int r=0; r<=5 ; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c+"" ); //column in pattern
		     }
			System.out.println();
		}
}
}
1
12
123
1234
12345  
 {
		for(int r=0; r<=5 ; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(r+"" ); //rows in pattern
		     }
			System.out.println();
		}
}
}
1
22
333
4444
55555

 {
		for(int r=5;r>=0 ; r--)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(+r+""); //rows in pattern
		     }
			System.out.println("");
		}
}
}
55555
4444
333
22
1


 
 {
		for(int r=0; r<=5 ; r++)
		{
			for(int c=0; c<=r; c++)
			{
				System.out.print("*" ); //rows in pattern
		     }
			System.out.println("");
		}
		for(int r=0; r<=5 ; r++)
		{
			for(int c=5; c>=r; c--)
			{
				System.out.print("*" ); //rows in pattern
		     }
			System.out.println("");
		}
}
}

*
**
***
****
*****
******
******
*****
****
***
**
*

 {
for(int r=0; r<=5 ; r++)
{
	for(int c=0; c<=r; c++)
	{
		System.out.print(+r+""); //rows in pattern
     }
	System.out.println("");
}
for(int r=4; r>=0 ; r--)
{
	for(int c=0; c<=r; c++)
	{
		System.out.print(+r+""); //rows in pattern
     }
	System.out.println("");
}
}
}
0
11
222
3333
44444
555555
44444
3333
222
11
0

 {
	 for(int r=0; r<=5 ; r++)
	 {
	 	for(int c=0; c<=r; c++)
	 	{
	 		System.out.print(+c+""); //rows in pattern
	      }
	 	System.out.println("");
	 }
 }
}
0
01
012
0123
01234
012345

 
 
	 

	 
