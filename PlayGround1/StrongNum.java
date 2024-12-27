

import java.util.Scanner;

class strongNum1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.print("Enter the value:");
        int num = sc.nextInt();
        // int num = 145;
        int temp = num, sum =0;
       
        while(num>0)
        {
            // System.err.println(num);
            int lastdigit = num %10;
            int factorial = 1;

            for(int i = 2;i<=lastdigit;i++)
            {
                factorial *= i;
            }
            sum += factorial;

            num /= 10;
        }
        if(sum == temp)
        {
            System.out.println(temp+" Strong");
        }
        else{
            System.out.println(temp+" not Strong");
        }

        sc.close();
        
    }
   
}
