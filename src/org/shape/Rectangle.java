package org.shape;
import java.util.*;
public class Rectangle extends Shape{
	String color="Red";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lenght:");
		int a=sc.nextInt();
		System.out.println("Enter Breath:");
		int b=sc.nextInt();
		Rectangle r=new Rectangle();
		System.out.println("Number of Cormers in Shape :" +r.noCorners);
		r.noCorners = 4;
		System.out.println("There are "+r.noCorners+" Corners in Rectangle");
		System.out.println("Rectangle is "+r.color+" in color");
		int output=r.calculateArea(a, b);
		System.out.println("Area of Rectangle: "+output);
	
	}

}
