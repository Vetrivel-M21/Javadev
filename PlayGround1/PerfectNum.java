import java.util.Scanner;
public class PerfectNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Enter the number :");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <=num/2;i++)
        {
            if(num%i==0){
                
                sum +=i;
            }
        }
        if (sum == num && num >1){
            System.out.println(num +" perfect number");
        }
        else{
            System.out.println(num+" not a perfect number");
         }
        sc.close();
    }
   
}
