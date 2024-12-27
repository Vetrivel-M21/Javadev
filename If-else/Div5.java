import java.util.*;

class Div5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a % 5 ==0)
        {
            System.out.println(a+" is Divisible by 5");

        }
        else
        System.out.println(a+" is not Divisible by 5");

    } 
 
    
}
