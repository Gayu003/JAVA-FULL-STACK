package com.selva;

class Vehicles{
	void drive() {
		System.out.println("Wear helmet");
	}
}
class Car extends Vehicles{
		void drive() {
			System.out.println("Repairing a car");
		}
}
public class Q2 {

	public static void main(String[] args) {
		Vehicles v=new Vehicles();
		v.drive();
		Car c=new Car();
		c.drive();

	}

}
