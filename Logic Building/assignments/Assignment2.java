//Question 1: Grade Classification
import java.util.*;
class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int marks=sc.nextInt();
        if(marks>=90){
        System.out.println("A");
        }
        else if(marks<89 && 85marks>80){
        System.out.println("B");
        }
        else if(marks<79 && marks>70){
        System.out.println("c");
        }
        else if(marks<89 && marks>80){
        System.out.println("D");
        }
        else if(marks<69 && marks>60){
        System.out.println("E");   
        }
        else
        System.out.println("F");
        }
}

//Question 2: Days of the Week 
import java.util.*;
class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;   
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}

//op:6
//Saturday

//Question 3: Calculator
import java.util.*;
class main{
    public static void main(String args[])
    {
      
        Scanner sc = new Scanner (System.in);
        System.out.println("enter two numbers" );
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("enter the character (+, -, *, /, % )");
        char ch = sc.next().charAt(0);
        double result;
        
        switch(ch){
          
            case '+':
                result= num1+num2;
                System.out.println(num1+ "+" +num2+ "=" +result);
                break;
             case '-':
               result= num1-num2;
                System.out.println(num1+ "-" +num2+ "=" +result);
                break;
            case '*':
                result= num1*num2;
                System.out.println(num1+ "*" +num2+ "=" +result);
                break;   
            case '/':
              result= num1/num2;
                System.out.println(num1+ "/" +num2+ "=" +result);
                break;
            case '%':
               result= num1%num2;
                System.out.println(num1+ "%" +num2+ "=" +result);
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}

//openter two numbers
/*23 2
enter the character (+, -, *, /, % )
+
23.0+2.0=25.0*/

//Question 4:: Discount Calculation

import java.util.*;
class main{
    public static void main(String args[])
    {
        double discount;
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER TOTAL PURCHASE AMMOUNT: " );
        double total = sc.nextDouble();
        System.out.println("Do you have Membership card ? y/n " );
        char i = sc.next().charAt(0);
        switch(i)
        {
        case'y':
            {
          
            discount = (total*5)/100;
            total = total-discount;
            System.out.println("extra 5% discount is added total is:" +total );
            if(total>=1000 )
            {
                discount= (total*20)/100;
                total= total- discount;
                System.out.println(" discount added 20% total is: " +total);
            }
            else if(total<=999 && total>=500 )
            {
                discount= (total*10)/100;
                total= total- discount;
                System.out.println("  discount added 10% total is: " +total);
            }
           else
            {
                discount= (total*5)/100;
                total= total- discount;
                System.out.println("  discount added 5% total is: " +total);
            }
        }
        case 'n':
            {
            if(total>=1000 )
            {
                discount= (total*20)/100;
                total= total- discount;
                System.out.println("  discount added 20% total is: " +total);
            }
            else if(total<=999 && total>=500 )
            {
                discount= (total*10)/100;
                total= total- discount;
                System.out.println("  discount added 10% total is: " +total);
            }
           else
            {
                discount= (total*5)/100;
                total= total- discount;
                System.out.println("  discount added 5% total is: " +total);
            }
            }
        }
            
        }
}

        
      /*op:ENTER TOTAL PURCHASE AMMOUNT: 
1000
Do you have Membership card ? y/n 
n
  discount added 20% total is: 800.0
	  */
	  
//Question 5: Student Pass/Fail Status with Nested Switch 

import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject1, subject2, subject3;
        int failCount = 0;

        System.out.println("Enter grades for three subjects (0-100):");
        
        System.out.print("Subject 1: ");
        subject1 = scanner.nextInt();
        
        System.out.print("Subject 2: ");
        subject2 = scanner.nextInt();
        
        System.out.print("Subject 3: ");
        subject3 = scanner.nextInt();

        switch (subject1 > 40 ? 1 : 0) {
            case 1:
                switch (subject2 > 40 ? 1 : 0) {
                    case 1:
                        switch (subject3 > 40 ? 1 : 0) {
                            case 1:
                                System.out.println("Student passed all subjects.");
                                break;
                            case 0:
                                failCount++;
                                break;
                        }
                        break;
                    case 0:
                        failCount++;
                        switch (subject3 > 40 ? 1 : 0) {
                            case 0:
                                failCount++;
                                break;
                        }
                        break;
                }
                break;
            case 0:
                failCount++;
                switch (subject2 > 40 ? 1 : 0) {
                    case 0:
                        failCount++;
                        break;
                }
                switch (subject3 > 40 ? 1 : 0) {
                    case 0:
                        failCount++;
                        break;
                }
                break;
        }
        
        if (failCount > 0) {
            System.out.println("Student failed in " + failCount + " subject(s).");
        }

        scanner.close();
    }
}

/*op:
Enter grades for three subjects (0-100):
Subject 1: 50
Subject 2: 40
Subject 3: 30
Student failed in 2 subject(s).
*/