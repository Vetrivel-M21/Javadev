import java.util.*;

class EvenOdd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a % 2 ==0)
        {
            System.out.println(a+" is EVEN number");

        }
        else
        System.out.println(a+" is ODD number");

    } 
 
    
}
