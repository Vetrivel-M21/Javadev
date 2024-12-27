import java.util.*;
class Grade
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
        System.out.print("Enter the Percentage : ");
        double per = sc.nextDouble();

        System.out.println("Processing...");
        Thread.sleep(3000);

        if(per >100 || per <0){
            System.out.println("Invalid");
        }

        if(per>=90 && per<=100)
        {
            System.out.println("GRADE : A");
        }
        if(per>=80 && per < 90)
        {
            System.out.println("GRADE : B");
        }

        if(per>=70 && per < 80)
        {
            System.out.println("GRADE : C");
        }
        
        if(per >=60 && per < 70)
        {
            System.out.println("GARDE : D");
        }

        if(per >=40 && per <60)
        {
            System.out.println("GRADE : E");
        }

        if(per <40 && per >0)
        {
            System.out.println("GRADE : F");
        }
 
        


    }
}