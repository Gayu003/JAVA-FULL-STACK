package com.selva;

class Shape{
	void getArea()
{
		}
}

class Rectangle1 extends Shape{
	void getArea(int length,int breadth) {
		int area=length*breadth;
		System.out.println(area);		
	}
}
public class Q3 {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		r.getArea(8,12);
	}

}
