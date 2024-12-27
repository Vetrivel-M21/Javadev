import java.util.*;

class Bike
{
    static Scanner bike = new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
        System.out.println("*****Enter the Bike Datails****\n");
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
        System.out.print("Enter Bike Name :");
        String BikeName = bike.next();
        System.out.print("Enter Bike Color :");
        String BikeColor = bike.next();
        System.out.print("Enter Bike Price :");
        double Price = bike.nextDouble();
       

        Sleep();
        
        
        System.out.println("\n****Bike Details ***");
        System.out.println("Bike  Name :"+BikeName);
        System.out.println("Bike Color :"+BikeColor);
        System.out.println("Bike Price :"+Price);
        
        

    }
}