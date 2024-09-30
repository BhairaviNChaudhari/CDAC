package interest.comp;
import java.util.Scanner;

class BMITracker11{
	float weight;
	float height;
	float BMI;
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getBMI() {
		return getWeight() / (getHeight() * getHeight());
	}
	public void setBMI(float bMI) {
		BMI = bMI;
	}
	public void acceptRecord(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the weight in (kg) :    ");
	setWeight(sc.nextFloat());
	System.out.print("Enter the height in (meter) :       ");
	setHeight(sc.nextFloat());
	sc.close();
	
	}
 
    public void classifyBMI() {
    	if (getBMI() < 18.5)
			System.out.println("You Are Underweignt    :( ");
			
		else if (getBMI()>18.5 && getBMI()<24.9)
			System.out.println("You Are Normal-Weighted :) ");
		
		else if (getBMI()>=25)
			System.out.println("You Are over-weignt     :( ");
    	
    }
    public void printRecord() {
    	System.out.println("Weight (kg)       :   "+getWeight());
    	System.out.println("height (meter)    :  " +getHeight());
    	System.out.println("BMI is            :  "+getBMI());
    	
    	
    }
	
}

public class settbmi {

	public static void main(String[] args) {
		BMITracker11 bm = new BMITracker11();
		bm.acceptRecord();
		bm.classifyBMI();
		bm.printRecord();
		

	}

}