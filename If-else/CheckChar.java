import java.util.*;

class CheckChar {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number : ");
        char a = sc.next().charAt(0);
        if(a>='A'&& a<='Z' || a>='a' && a<='z')
        {
            System.out.println(a+" is Alphabet");

        }
        else
        System.out.println(a+" is not a  Alphabet");

    } 
 
    
}

