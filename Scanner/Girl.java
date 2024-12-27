import java.util.*;

class Girl
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
        System.out.println("*****Enter the  Girl Datails****\n");
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
        System.out.print("Enter Girl Name :");
        String GName = sc.next();
        System.out.print("Enter Girl Weight :");
        int GWeight = sc.nextInt();
        System.out.print("Enter Girl's father Name :");
        String Gfname = sc.next();
        System.out.print("Enter Girl Contact :");
        long GCon = sc.nextLong();

        Sleep();
        
        
        System.out.println("\n****Employee Details ***");
        System.out.println("Girl Name :"+GName);
        System.out.println("Girl Weight :"+GWeight);
        System.out.println("Girl's Father Name :"+Gfname);
        System.out.println("Girl Contact :"+GCon);
        

    }
}