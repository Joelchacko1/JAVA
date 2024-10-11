import java.util.Scanner;
class employee{
    String name;
    int age;
    int experience;
    employee(String name,int age,int experience){
        this.name=name;
        this.age=age;
        this.experience=experience;
        

    }
    class FullTimeEmployee extends employee{
        int AnnualSalary;
        FullTimeEmployee(){

            void AnnualSalary(){

            }
        }

    }
}
public class Inheritance3 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enthe name of employee:");
        String name=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the experience:");
        int exp=sc.nextInt();


    }
}
