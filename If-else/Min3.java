import java.util.*;

class Min3
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter A :");
        int a =sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();
        if(a<b && a < c)System.out.println(a+" is minimum value");
        else{
            if(b < a && b<c)
                System.out.println(b+" is minimum value");
            
            else
            System.out.println(c+" is minimum value");

        }
         


    }
}