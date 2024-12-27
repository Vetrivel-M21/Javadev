import java.util.*;

class PlussMinuss {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        if(a ==0)
        {
            System.out.println(a+" is ZERO number");

        }
        else{
            if(a< 0)
        {
            System.out.println(a+" is NEGATIVE number");

        }
        else
        System.out.println(a+" POSITIVE number");
        }
    } 
 
    
}

