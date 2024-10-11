import java.util.Scanner;
class Employee {
    String name;
    int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
        System.out.println("......Employee....");
        System.out.println("Name"+name);
        System.out.println("Employee Id:"+employeeID);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int employeeID, String department) {
        super(name, employeeID); 
        this.department = department;
        System.out.println("..... Manager....");
        System.out.println("Name"+name);
        System.out.println("Employee Id:"+employeeID);
        System.out.println("Department:"+department);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of employee: ");
        String empName = sc.nextLine();
        System.out.print("Enter the employee ID: ");
        int empID = sc.nextInt();
        sc.nextLine(); 
        Employee e = new Employee(empName, empID);

        System.out.print("Enter the name of manager: ");
        String mgrName = sc.nextLine();
        System.out.print("Enter the manager ID: ");
        int mgrID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the department: ");
        String dept = sc.nextLine();

        
        Manager m = new Manager(mgrName, mgrID, dept);

        
        sc.close();
    }
}
