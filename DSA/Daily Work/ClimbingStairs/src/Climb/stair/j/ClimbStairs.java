package Climb.stair.j;
import java.util.*;
public class ClimbStairs {
public static int climbStaair(int s ) {
	if(s==0)
	   return 1;
	if(s==1)
		return 1;

	int ds[]=new int [s+1];
	 ds[0]=1;
	 ds[1]=1;
 for(int i=2;i<=s;i++) {
	 ds[i]=ds[i-1]+ds[i-2];
 }
 return ds[s];	
}	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the element no of stairs :");
	int s= sc.nextInt();//climbing a staircase with input no of stairs
	System.out.println("number of ways to climb "+s+" Stairs: "+climbStaair(s));
	
	sc.close();
	
}		
}

//if step=4
//then-
//public static int climbStaair(4) //here steps are 4
//int ds[5]
//	ds[0]=1;
//    ds[1]=1;
//    ds[2]=ds[1]+ds[0]
//    i++
//    ds[3]=ds[2]+ds[1]
//    i++
//    ds[4]=ds[3]+ds[2]...      //5
//    out of for loop
//    Return the number of ways to  reach at top
//	