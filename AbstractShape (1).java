package mod2;
import java.util.Scanner;
  abstract class Shape{
	  abstract void NoOfSides();
	  
		  
  }
  class rectangle extends Shape{
	  int sum,s;
	rectangle(int s){
		this.s=s;
	}
	
	  void NoOfSides() {
		  System.out.println("Shape with"+s+"sides");
		  System.out.println("I am a rectangle i has 4 sides");
		  sum=(s-2)*180;
		  System.out.println("sum of angle"+sum);
	  
	  
  }
  }
  class triangle extends Shape{
	  int sum,s;
	  triangle(int s){
		  this.s=s;
	  }
	  void NoOfSides() {
		  System.out.println("Shape with"+s+"sides");
		  System.out.println("I am a Trianle ,I have 3 sides");
		  sum=(s-2)*180;
		  System.out.println("sum of angle"+sum);
		  
	  }
	  
  }
	  class hexagon extends Shape{
		  int sum,s;
		  hexagon(int s){
			  this.s=s;
		  }
		  void NoOfSides() {
			  System.out.println("Shape with"+s+"sides");
			  System.out.println("I am a Hexagon,i have 6 sides");
			  sum=(s-2)*180;
			  System.out.println("sum of angle"+sum);
			  
			  
		  }
	  }
	  
public class AbstractShape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
	do {
		System.out.println("Enter the number of side of geometric shape:");
		int s=sc.nextInt();
		
		switch(s) {
		case 3:
			triangle t=new triangle(3);
			t.NoOfSides();
			break;
		case 4:
			rectangle r=new rectangle(4);
			r.NoOfSides();
			break;
		case 6:
			hexagon h=new hexagon(6);
			h.NoOfSides();
			break;
			default:
                 System.out.println("invalid statment");
                 	
		}
                 System.out.println("Do u wantto countinue(Y/N)");
                 c=sc.next().charAt(0);
                 
                 
		
	}
	while(c=='y'||c=='Y');
		
	}}
		

	


