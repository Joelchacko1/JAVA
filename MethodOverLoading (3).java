package oopj24csb42;
import java.util.Scanner;
class Area{
	int l;
	int b;
	int r;
	


//public class MethodOverLoading {
public double area(int a,int b) {
	return a*b;
}
public double area(float a) {
	return 3.14*a;
}}
public class MethodOverLoading {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	Area area=new Area();
		System.out.println("Enter the  base of the triangle");
		int b=sc.nextInt();
		System.out.println("Enter the  height of the triangle:");
		int h=sc.nextInt();
		System.out.println("Enter the Width of the rectangle:");
		int w=sc.nextInt();
		System.out.println("Enter the Height of the rectangle:");
		int rh=sc.nextInt();
		System.out.println("Enter the radious of the circle:");
		int r= sc.nextInt();
		
		double rectanglearea=area.area(w,rh);
		double trianglearea=area.area(b,h);
		double circlearea=area.area(r);
		
    System.out.println("Area of rectangle with base:"+b+" "+"and height:"+h+" "+"is:"+rectanglearea);
    System.out.println("Area of triangle with base:"+b+" "+"and height:"+h+" "+"is:"+trianglearea);
    System.out.println("Area of circle with radious:"+b+" "+"and height:"+h+" "+"is:"+circlearea);
    
	}

}
