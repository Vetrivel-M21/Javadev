
import java.util.*;

class Vote
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter Your Name :");
        String name =sc.next();
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        if(age>=18)System.out.println(name +" is eligible for Voting");
        else
         System.out.println(name+" is not eligible for Voting");


    }
}