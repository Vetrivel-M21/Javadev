import java.util.*;

class Task1
{
    static Scanner np = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number:");
        int num = np.nextInt();

        String res = (num == 0)?"Either OOD or EVEN":((num % 2)==0)?"EVEN": "ODD";
        System.out.println("Given Number "+num +" is "+res);
    }
}