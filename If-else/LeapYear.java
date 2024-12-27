import java.util.*;

class LeapYear{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a % 4 ==0)
        {
            System.out.println(a+" is LeapYear ");

        }
        else
        System.out.println(a+" is Not LeapYear");

    } 
 
    
}

