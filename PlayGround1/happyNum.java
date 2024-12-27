import java.util.Scanner;
public class happyNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum =0;
        int lastDigit = 0;

        while(num != 1 && num !=4)
        {
            sum =0;
            while(num>0){
                lastDigit = num % 10;
                sum += lastDigit*lastDigit;
                num /= 10;
            }
            num = sum;
        }
        if (num == 1){
            System.out.println(temp+" is a happy number");
        }
        else{
            System.out.println(temp +" not a happy number");
        }
        
    }
}
