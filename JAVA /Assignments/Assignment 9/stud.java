package org.co.bank;
class Student {
	String name;
	int prn;
	int age;
	static String institute = "CDAC MUMBAI";

	public Student() {
	}

	public Student(String name, int prn, int age, String institute) {
		this.name = name;
		this.prn = prn;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printrec() {
		System.out.println("name : " + this.getName());
		System.out.println("age : " + this.getAge());
		System.out.println("prn : " + this.getPrn());
		System.out.println("institute : " + this.institute);
	}
}

public class stud {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setName("Bhairavi");
		stud.setAge(22);
		stud.setPrn(12345);
		stud.printrec();
		}


}
//name : Bhairavi
//age : 22
//prn : 12345
//institute : CDAC MUMBAI