import java.util.*;

class Sal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Gender : ");
        char Gender = sc.next().charAt(0);
        System.out.print("Year Of Experience : ");
        int Year_Of_Experience = sc.nextInt();
        System.out.println("\n*******Qualification*****");
        System.out.println("1.Post-Graduate\n2.Graduate");
        System.out.print("Enter Your Graduation: ");
        int Qualification = sc.nextInt();
        if(Gender == 'M'){

        if(Year_Of_Experience >= 10)
        {
            if(Qualification == 1)
            {
                System.out.println("Your salary is Rs: 15000");
            }
            else System.out.println("Your salary is Rs: 10000");
        }
        else if(Year_Of_Experience < 10)
        {
            if(Qualification == 1)
            {
                System.out.println("Your salary is Rs: 10000");
            }
            else System.out.println("Your salary is Rs: 7000");
        }
    }else{
        if(Year_Of_Experience >= 10)
        {
            if(Qualification == 1)
            {
                System.out.println("Your salary is Rs: 12000");
            }
            else System.out.println("Your salary is Rs: 9000");
        }
        else if(Year_Of_Experience < 10)
        {
            if(Qualification == 1)
            {
                System.out.println("Your salary is Rs: 10000");
            }
            else System.out.println("Your salary is Rs: 6000");
        }
            }
    }
    
}
