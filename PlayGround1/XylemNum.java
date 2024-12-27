import java.util.*;

class XylemNum {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value :");
        int num  = sc.nextInt();
        int lastdigit = 0, meanDigit= 0;
        int temp = num;
        int extremSum =0, meanSum=0;
        int org = num;

        //find the last digit
        lastdigit = num  % 10;
        extremSum += lastdigit;
        temp = num / 10;
        //avoid first digit
        while(temp>=10)
        {
            meanDigit = temp % 10;
            meanSum +=meanDigit;
            temp /=10;
        }
        // add first and last digit
        extremSum += temp;

        if(extremSum == meanSum)
        {
            System.out.println(org+" is Xylem Number");
        }
        else{
            System.out.println(org+" not a Xylem Number");
        }        
    }
}
