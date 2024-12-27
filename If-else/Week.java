import java.util.*;

class Week {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        if(a >=1 && a <=7)
        {
           if(a == 1) System.out.println("SUNDAY");
           if(a == 2) System.out.println("MONDAY");
           if(a == 3) System.out.println("TUESDAY");
           if(a == 4) System.out.println("WEDNESDAY");
           if(a == 5) System.out.println("THURSDAY");
           if(a == 6) System.out.println("FRIDAY");
           if(a == 7) System.out.println("SATURDAY");
        }
        else{
        System.out.println("Invalid ");
        }
    } 
 
    
}

