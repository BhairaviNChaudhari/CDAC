/*Program 1:
Write a program to calculate the sum of the first 50 natural numbers. 
class main3{
    public static void main(String args[])
    
    {
        int i,sum=0;
        for(i=1;i<=50;i++){
         sum = sum+i;

        }
        System.out.println("Sum of first 50 natural number is : "+sum);
    }
}

//op:Sum of first 50 natural number is : 1275


//program 2:
//Write a program to compute the factorial of the number 10. 
 
class main3{
    public static void main(String args[])
    
    {
        int i,fact=1;

        for(i=1;i<=10;i++){
         fact =fact*i ;

        }
        System.out.println("Factorial of the number 10 is : "+fact);
    }
}

//op:Factorial of the number 10 is : 3628800

//Program 3:
//Write a program to print all multiples of 7 between 1 and 100. 
class main3{
    public static void main(String args[])
    {
        int i;
        System.out.println("Multiple of 7:");
        for (i=7;i<100;i++)
        {
            if(i%7==0)
            System.out.print(" "+i);
        }
        
    }

}
//op
//Multiple of 7:
 //7 14 21 28 35 42 49 56 63 70 77 84 91 98

 //Program 4:
 //Write a program to reverse the digits of the number 1234. The output should be 4321.
class main3 {
    public static void main(String args[]){
       int num=1234;
       int rev=0;
       while(num!=0)
       {
        int r=num%10;
        rev=rev*10+r;
        num=num/10;

       }
       System.out.println("reverse digit is: "+rev);
          }
}
//Program 5:
//Write a program to print the Fibonacci sequence up to the number 21. 
class main3 {
    public static void main(String args[]){
       int num=21;
       int i,f1,f2=0,f3=1;
       for(i=1;i<=num;i++)
       {
        System.out.println(" " +f3+ " ");
        f1=f2;
        f2=f3;
        f3=f1+f2;
       }
          }
}

//Program 6:
//Write a program to find and print the first 5 prime numbers. 
class main3{
public static void main(String[] args)   
{  
int c=0,n=0,i=1,j=1;  
while(n<5)  
{  
j=1;  
c=0;  
while(j<=i)  
{  
if(i%j==0)  
c++;  
j++;   
}  
if(c==2)  
{  
System.out.printf("%d ",i);  
n++;  
}  
i++;  
}  
}  
}  
op:2 3 5 7 11
//Program 7:
//Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6). 
public class main   
{  
public static void main(String args[])  
{  
int number=9876, digit, sum = 0;   
while(number > 0)  
{    
digit = number % 10;  
sum = sum + digit;  
number = number / 10;  
}    
System.out.println("Sum of Digits: "+sum);  
}  
}  
op: Sum of Digits: 30
//Program 8:
//Write a program to count down from 10 to 0, printing each number. 
class main3{
    public static void main(String args[])
    {
        int i;
          System.out.print("count down 10 to 0: ");
        for (i=10;i>=0;i--)
        {
            System.out.print(" "+i);
        }
        
    }

}
//op:count down 10 to 0:  10 9 8 7 6 5 4 3 2 1 0
 

//Program 10:
//Write a program to print all even numbers between 1 and 50
class main3{
    public static void main(String args[])
    {
        int i;
          System.out.print("Even no between 1 to 50 are:  ");
        for (i=1;i<=50;i++)
        {
            if(i%2==0)
            System.out.print(" "+i);
        }
        
    }

}
//op: Even no between 1 to 50 are:   2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50

//Program 11:
//Write a Java program to demonstrate the use of both pre-increment and post-decrement 
//operators in a single expression 
 class Assignment3 {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;

        System.out.println("Initial values:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Using pre-increment and post-decrement in a single expression
        int result = ++i + j-- - i--;

        System.out.println("\nAfter expression:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("result = " + result);
    }
}


//Program 12:
 /*Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
***** 

class main3{
    public static void main(String args[]){
        int i,j;
        for(i=0;i<=5;i++)
        {
            for(j=0;j<=5;j++)
            {
                System.out.print("*");
            }  
            System.out.println();
        }   }
} 

Program 13:
/* Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2
1 
class main3{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++)
        {
            System.out.print(+i);
            for(j=2;j<=i;j++)
            {
                System.out.print("*"+i);
            }
                 System.out.println("");
        }
        for(i=4;i>=1;i--)
        {
            System.out.print(+i);
            for(j=2;j<=i;j++)
            {
                System.out.print("*"+i);
            }
                 System.out.println("");
        }
} 
} */

/*Program 14:
* 
 ** 
 *** 
 ***** 
 ******* 
 ********* */




/*Program 15:

Write a program to print the following pattern: 
 * 
 ** 
 *** 
 **** 
 ***** 
class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");            }
                System.out.println();
        }
    }
}*/

/*16. Write a program to print the following pattern: 
 * 
 *** 
 ***** 
 ******* 
********* */
/*class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=10;i+=2)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");           
                 }
                System.out.println();
        }
    }
}

/* 
17. Write a program to print the following pattern: 
***** 
 **** 
 *** 
 ** 
 *  */
/*class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for (i=5;i>0;i--){
               for(j=1;j<=i;j++){
               System.out.print("*");

               }
               System.out.println();
        }
        
    }
}

18. Write a program to print the following pattern: 
 * 
 *** 
 ***** 
 ******* 
 ***** 
 *** 
 * 
class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=10;i+=2)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");           
                 }
                System.out.println();
        }

         for(i=7;i>0;i-=2)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");           
                 }
                System.out.println();
        }
    }
}




19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5  
class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j+"*");           
                 }
                System.out.println();
        }
    }
}*/

/*
20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 
class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i>=5;i++)
        {
            for (j=5;j>=i;j--)
            {
                System.out.print(j+"*");           
                 }
                System.out.println();
        }
    }
}


21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9

class Assignment3{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i>=10;i++)
        {
            for (j=1;j>=i;j+=2)
            {
                System.out.print(j+"*");
            }
            System.out.println();
        }
    }
}*/

/* 
22. Write a program to print the following pattern: 
********* 
 ******* 
 ***** 
 *** 
 * 
 *** 
 ***** 
 ******* 
*********
class Assignment3{
 public static void main(String args[])
    {
        int i,j;
        for(i=10;i>=1;i-=2)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");           
                 }
                System.out.println();
        }
        for(i=1;i<=10;i+=2)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");           
                 }
                System.out.println();
        }
    }
}
23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555 
class Assignment3 {
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=0;j<=5;j++)
            {
                System.out.print(+i);
            }  
            System.out.println();
        }   }
}


24. Write a program to print the following pattern: 
1 
22 
333 
4444 
55555 
class Assignment3 {
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(+i);
            }  
            System.out.println();
        }   }
}

25. Write a program to print the following pattern: 

1 
12 
123 
1234 
12345 
class Assignment3{
public static void main(String args[])
     {
        int i,j;
        for(i=1;i>=5;i++)
        {
            for(j=1;j<i;j++)
            {
              System.out.print(j+"");
            }
            System.out.println();
        }

     }
}*/
/* 
26. Write a program to print the following pattern: 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
class Assignment3{
    public static void main(String args[])
    {
    int i,j,c=0;
        for(i=0;i<15;i++)
        {
            for(j=1;j<i;j++)
            {
                if(c!=15)
                {
                    c++;
                    System.out.print(c+" ");
                    
                }
                else
                    break;

            }

            System.out.println(" ");
        }
    }

    }

}
*/



