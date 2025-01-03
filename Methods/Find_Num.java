import java.util.Scanner;

public class Find_Num {
    static Scanner sc = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m"; 
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED ="\u001B[31m"; 
    public static final String ANSI_PURPLE="\u001B[35m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
     public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static void main(String[] args)throws Exception {
        boolean flag =true;
        int value=0;
        
        System.out.println(ANSI_GREEN +"Welcome to find the Number App"+ANSI_RESET);
        do{
            
            boolean prime,perfect_Square;
            Thread.sleep(2500);
            System.out.println(ANSI_YELLOW+"1.Prime Number\n2.Palindrome Number\n3.Factorial of The Number\n4.Perfect Square Number\n5.Exit"+ANSI_RESET);
            System.out.print(ANSI_RED+"Select the Input(1 or 2 or 3 or 4 or 5) :"+ANSI_RESET);
            int input = sc.nextInt();
            Thread.sleep(1000);

            if(input>0 && input <=4 )
            {
                System.out.print(ANSI_PURPLE+"Enter the Number Want to Check:"+ANSI_RESET);
                value = sc.nextInt();
                Thread.sleep(1000);
            }
            else if(input !=5){
                Thread.sleep(2000);
                System.out.println(ANSI_GREEN_BACKGROUND+"Invalid input Selection. Select the Input Again"+ANSI_RESET);
            }
            switch (input) {
                case 1:{
                    prime = Prime_num(value);
                    if(prime) System.out.println(ANSI_RED_BACKGROUND+value+" is prime Number"+ANSI_RESET);
                    else System.out.println(ANSI_RED_BACKGROUND+value+" not a prime Number"+ANSI_RESET);
                    Thread.sleep(3000);
                    break;}
                case 2:{

                    int revesre = Palindrome(value);
                    if(revesre==value) System.out.println(ANSI_RED_BACKGROUND+value+" is reversed as "+revesre+" so it palindrom"+ANSI_RESET);
                    else System.out.println(ANSI_RED_BACKGROUND+value+" is reversed as "+revesre+" not a Palindrom"+ANSI_RESET);
                    Thread.sleep(3000);
                    break;}
                case 3:{
                    //call the Factorial funtion & store the return value in factorial
                    int factorial = factorial(value);
                    System.out.println(ANSI_RED_BACKGROUND+value+" factorial is  :"+factorial +ANSI_RESET);
                    Thread.sleep(3000);
                    break;}
                case 4:{
                    perfect_Square = Perfect_Square(value);
                    if(perfect_Square) System.out.println(ANSI_RED_BACKGROUND+value+" is Perfect Square Number"+ANSI_RESET);
                    else System.out.println(ANSI_RED_BACKGROUND+value+" is not a Perfect Square Number"+ANSI_RESET);
                    Thread.sleep(3000);
                    break;}
                case 5:{
                    flag=false;
                    System.out.print("Exiting.");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    
                    break;}
                default:
                    // System.out.println(ANSI_PURPLE+"Something went wrong"+ANSI_RESET);
                    break;
            }
        }while(flag);
        Thread.sleep(2000);
        System.out.println(ANSI_PURPLE+"\nThank you for coming see you  soon.."+ANSI_RESET);
    }
    //Prime number
    public static boolean Prime_num(int a)throws Exception
    {
        for(int i =2; i<a-1;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;       
    }
    //Palindrom
    public static int Palindrome(int a)throws Exception{
        //create temp value for original value
        int temp = a;
        int reverse=0;

        while(temp>0)
        {   //get the last digit
            int lastdigit = temp%10;
            //store the last value with multiply by 10
            reverse = reverse*10 + lastdigit;
            temp/=10;
        }
        //return reverse value to check
        return reverse;

    }
    public static int factorial(int a) throws Exception
    {
        int fact = 1;
        for(int i= 2;i<=a;i++)
        {
           fact *=i;
        }
        return fact;
    }
    public static boolean Perfect_Square(int a) throws Exception
    {
        for(int i = 1; i*i<=a;i++)
        {
           if(i * i == a){
            return true;
           }
        }
        return false;
    }
}
