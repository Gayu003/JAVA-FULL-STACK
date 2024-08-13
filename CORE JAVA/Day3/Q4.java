package com.selva;

class Employee1{
	void work() {
		
	}
	void getSalary() {
		
	}
}
class HRManager extends Employee1{
	void work() {
		System.out.println("Add a new employee");
	}
	void addEmployee() {
		System.out.println("Employee added");
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HRManager h=new HRManager();
 h.work();
 h.addEmployee();
	}

}
