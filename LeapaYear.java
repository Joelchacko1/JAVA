import java.util.Scanner;
public class LeapaYear {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the year to find leap year or not:");
        int y=sc.nextInt();
        if(((y%400==0)&&(y%100!=0))||(y%4==0)){
            System.out.println("the given year is leap year:");
        }
        else{
            System.out.println("the given year is not a laep year");

        }

    }
    
}
