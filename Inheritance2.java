import java.util.Scanner;
class vehicle{
    String model;
    int year;
     vehicle(String model,int year){
        this.model=model;
        this.year=year;
        System.out.println("Model"+model);
        System.out.println("year:"+year);
     }
}
class car extends vehicle{
    int Door;
    car(String model, int year, int Door){
        super(model, year);
        this.Door=Door;
        System.out.println("number of doors:"+Door);
    }
 
}
class electricCar extends car{
    int battery;
    electricCar(String model, int year, int Door,  int battery){
        super(model,year,Door);
        this.battery=battery;
        System.out.println("Batterycapacity:"+battery);

    }

}
public class Inheritance2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model number:");
        String model=sc.nextLine();
        System.out.println("Enter the the year:");
        int year=sc.nextInt();
        System.out.println("Enter the number of doors:");
        int door=sc.nextInt();
        System.out.println("Enter the batter capacity:");
        int battery=sc.nextInt();

        
        electricCar e=new electricCar(model,year, door,battery);

    }
    
}
