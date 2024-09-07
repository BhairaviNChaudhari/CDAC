package info.Emp;

import java.util.*;

class employee {
	String name;
	String Addr;
	int id;

	Scanner sc = new Scanner(System.in);

	public void getinfo() {
		System.out.println("Enter the name of the Employee: ");
		String name = sc.nextLine();
		System.out.println("Enter the Adderss (city) of the Employee :");
		String Addr = sc.nextLine();
		System.out.println("Enter the id of the employee: ");
		int id = sc.nextInt();
		

	}

	public void printemp() {
		System.out.println("\nName : "+name+ " id  : " +id);
	}

}

class Emp {

	public static void main(String[] args) {
		employee vid = new employee();
		vid.getinfo();
		vid.printemp();

	}

}

//Enter the name of the Employee: 
//Bhairavi
//Enter the Adderss (city) of the Employee :
//Jalgaon
//Enter the id of the employee: 
//877
//Name : Bhairavi id  : 877

