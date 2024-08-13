package com.selva;


class Person1
{
	void getFirstName(String fname)
	{
		System.out.println(fname);
	}
	void getLastName(String lname)
	{
		System.out.println(lname);
	}
}
class Employee2 extends Person1
{
	void getFirstName(String fname)
	{
		System.out.println(fname);
	}
	void getLastName(String jtitle)
	{
		System.out.println(jtitle);
	}
}
public class Q7 {

	public static void main(String[] args) {
  
		Person1 p=new Person1();
		p.getFirstName("selva");
		p.getLastName("gayathri");
		Employee2 e=new Employee2();
		e.getLastName("Full Stack Developer");
	}

}