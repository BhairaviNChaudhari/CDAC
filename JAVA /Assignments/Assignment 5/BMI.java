package interest.comp;
import java.util.Scanner;
//3. BMI (Body Mass Index) Tracker
//Create a system to calculate and classify Body Mass Index (BMI). The system should:
//1.	Accept weight (in kilograms) and height (in meters) from the user.
//2.	Calculate the BMI using the formula:
//o	BMI Calculation: BMI = weight / (height * height)
//3.	Classify the BMI into one of the following categories:
//o	Underweight: BMI < 18.5
//o	Normal weight: 18.5 ≤ BMI < 24.9
//o	Overweight: 25 ≤ BMI < 29.9
//o	Obese: BMI ≥ 30
//4.	Display the BMI value and its classification.
//Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method.
//
class BMITracker{
	float weight;
	float height;
	float BMI;
	public void acceptRecord(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the weight in (kg) :    ");
	weight = sc.nextFloat();
	System.out.print("Enter the height in (meter) :       ");
	height = sc.nextFloat();
	
	}
    public void calculateBMI() {
    	BMI = weight / (height * height);
    	System.out.println("BMI is :    " +BMI);
    }
    public void classifyBMI() {
    	if (BMI < 18.5)
			System.out.println("You Are Underweignt    :( ");
			
		else if (BMI>18.5 && BMI<24.9)
			System.out.println("You Are Normal-Weighted :) ");
		
		else if (BMI>=25)
			System.out.println("You Are over-weignt     :( ");
    	
    }
    public void printRecord() {
    	System.out.println("Weight (kg)       :   "+weight);
    	System.out.println("height (meter)    :  " +height);
    	System.out.println("BMI is            :  "+BMI);
    	
    	
    }
	
}

public class BMI {

	public static void main(String[] args) {
		BMITracker bm = new BMITracker();
		bm.acceptRecord();
		bm.calculateBMI();
		bm.classifyBMI();
		bm.printRecord();
		

	}

}


//Enter the weight in (kg) :    40
//Enter the height in (meter) :        0.8
//BMI is :    62.499996
//You Are over-weignt     :( 
//Weight (kg)       :   40.0
//height (meter)    :  0.8
//BMI is            :  62.499996

