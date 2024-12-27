import java.util.*;

class Triangle
{
    static Scanner np= new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the value of first side :");
        double value1 = np.nextDouble();
        System.out.print("Enter the value of first side :");
        double value2 = np.nextDouble();
        System.out.print("Enter the value of first side :");
        double value3 = np.nextDouble();

        if(value1 == value2 && value1 == value3)
        {
            System.out.println(" Equilateral Triangle");
        }

        else{
        if(value1 != value2 && value1!= value3)
        {
            System.out.println("isoscales Triangle");
        }
        }


    }

}
