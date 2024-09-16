package org.co.bank;
class Animal {
	String name;

	public Animal() {
		this.name = " ";
	}

	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(this.name + " is eating ");
	}

	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		this.name = name;
	}

	public void bark() {
		super.eat();
		super.sleep();
		System.out.println(this.name + " is barking");
	}
}

public class Program3 {
	public static void main(String[] args) {
		Animal an = new Animal("DOG");
		Dog d = new Dog("DOG");
		an.eat();
		an.sleep();
		d.bark();
		}

}

//DOG is eating 
//DOG is sleeping
//DOG is eating 
//DOG is sleeping
//DOG is barking
