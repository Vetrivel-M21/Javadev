import java.util.*;

class Div11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a % 11 ==0)
        {
            System.out.println(a+" is Divisible by 11");

        }
        else
        System.out.println(a+" is not Divisible by 11");

    } 
 
    
}
