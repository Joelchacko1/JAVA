import java.util.Scanner;
public class fibinocci {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner (System.in);
        int a=0,b=1;
        int n,f=0;
        System.out.println("Enter the number limit:");
        n=sc.nextInt();
        int i=1;
        while(i<=n){
        f=a+b;
        System.out.print("\t"+f);
        a=b;
        b=f;
        i++;
        sc.close();

        }
    }
}
