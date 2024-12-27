import java.util.*;

class Leapyear
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the year :");
        int year = sc.nextInt();

        if(year < 0 ){
            System.out.println("Invalid");
        }

        if(year%4==0)
        {
            System.out.println("The year "+ year +" is LeapYear");
        }
        if(year%4!=0)
        {
            System.out.println("The year "+ year +" is not  LeapYear");
        }

    }
}