import java.util.*;

class Div3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a % 3 ==0)
        {
            System.out.println(a+" is Divisible by 3");

        }
        else
        System.out.println(a+" is not Divisible by 3");

    } 
 
    
}
