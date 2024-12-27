
import java.util.*;

class Vowel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the character : ");
        char a = sc.next().charAt(0);

        if(a == 'A' || a =='E' || a == 'I' || a == 'O' || a == 'U')
        {
            System.out.println(a+" is VOWEL Character");

        }
        else{
            if(a == 'a' || a =='e' || a == 'i' || a == 'o' || a == 'u')
        {
            System.out.println(a+" is VOWEL Character");

        }
        else
        System.out.println(a+" is Consonant Character");
        }
    } 
 
    
}

