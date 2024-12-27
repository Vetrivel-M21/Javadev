import java.util.*;

class Friend
{
    static Scanner Frd = new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
        System.out.println("*****Enter the Friend Datails****\n");
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
        System.out.print(".\n");
        Thread.sleep(2000);
    }

    static void ReadEmp()throws Exception
    {
        System.out.print("Enter Friend Name :");
        String FrdName = Frd.next();
        System.out.print("Enter Age :");
        double FrdAge = Frd.nextDouble();
        System.out.print("Enter Contact Contact :");
        long FrdCon = Frd.nextLong();

        Sleep();
        
        
        System.out.println("\n****Friend Details ***");
        System.out.println("Name :"+FrdName);
        System.out.println("Age :"+FrdAge);
        System.out.println("Contact :"+FrdCon);
        

    }
}