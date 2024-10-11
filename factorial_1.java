import java.util.*;
public class factorial_1{
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        int i=1;
        System.out.println("Enter the number to find the factorial:");
        int f=s.nextInt();
        while( i<=f){
            f*=i;
            i++;
        }
        System.out.println("The factorial is :"+f);
    }
}