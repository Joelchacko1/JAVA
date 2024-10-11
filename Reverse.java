import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner (System.in);
        int r,rev=0;
        System.out.println("Enter the number to find :");
        int n=sc.nextInt();
        for(;n>0;n=n/10){
          r=n%10;
          rev=rev*10+r;
        }
        System.out.println("The reverse of the number is :"+rev);
        sc.close();
    }
}
