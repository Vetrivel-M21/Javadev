import java.util.*;

class Employee
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
        System.out.println("*****Enter the Employee Datails****\n");
        ReadEmp();


    }

    static void Sleep()throws Exception{
        System.out.print("Processing");

        Thread.sleep(2000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(2000);
    }

    static void ReadEmp()throws Exception
    {
        System.out.print("Enter Employee Name :");
        String EmpName = sc.next();
        System.out.print("Enter Employee Id :");
        int EmpId = sc.nextInt();
        System.out.print("Enter Employee salary :");
        double EmpSal = sc.nextDouble();
        System.out.print("Enter Employee Contact :");
        long EmpCon = sc.nextLong();

        Sleep();
        
        
        System.out.println("\n****Employee Details ***");
        System.out.println("Employee Name :"+EmpName);
        System.out.println("Employee Id :"+EmpId);
        System.out.println("Employee Salary :"+EmpSal);
        System.out.println("Employee Contact :"+EmpCon);
        

    }
}