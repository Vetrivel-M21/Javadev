import java.util.*;

class Min
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter A :");
        int a =sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        if(a<b)System.out.println(a+" is minimum value");
        else
         System.out.println(b+" is minimum value");


    }
}