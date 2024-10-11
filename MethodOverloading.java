/*import java.util.*;
class Area{

    void area(int bl,int th){
        int a=bl*th/2;
        System.out.println("The area of the triangle with base:"+bl+" and height:"+th+"is:"+a);
    }
    void area(int hr,int rw){
       int a=hr*rw;
        System.out.println("The area of the rectangle with width:"+rw+" and height:"+hr+"is:"+a);        
    }

    
}
public class MethodOverloading {
    public  void main(String[]args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base  of triangle:");
        int bl=sc.nextInt();
        System.out.println("Height of the triangle:");
        int th=sc.nextInt();
        System.out.println("Enter the width of the rectangle");
        int rw=sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int hr=sc.nextInt();
        System.out.println("Enter the radious of the circle:");
        int r=sc.nextInt();

        Area a1=new Area();
        a1.area(bl,th);
    }   a1.area(rw,hr);
}/* */
import java.util.*;

class Area {

    void area(int bl, int th) {
        int a = bl * th / 2;
        System.out.println("The area of the triangle with base: " + bl + " and height: " + th + " is: " + a);
    }

    void area(int rw, int hr) {
        int a = rw * hr;
        System.out.println("The area of the rectangle with width: " + rw + " and height: " + hr + " is: " + a);
    }
}

public class MethodOverloading {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base of the triangle:");
        int bl = sc.nextInt();
        System.out.println("Height of the triangle:");
        int th = sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int rw = sc.nextInt();
        System.out.println("Enter the height of the rectangle:");
        int hr = sc.nextInt();
        
        // Note: Since no area calculation for circle is present, removing unnecessary input
        Area a1 = new Area();
        a1.area(bl, th);
        a1.area(rw, hr);
    }
}
