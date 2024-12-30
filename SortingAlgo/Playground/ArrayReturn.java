import java.util.Arrays;
import java.util.Scanner;
public class ArrayReturn {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {3, 4,5, 2,1, 6,8};
        System.out.print("Enter the value : ");
        int target = sc.nextInt();
        int [] sum = SumofTwoSum(a,target);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(sum));
    }

    public static int[] SumofTwoSum(int[] a, int target)
    {
        for(int i =0 ;i<a.length; i++)
        {
            for(int j =0; j<a.length;j++)
            {
                if(a[j] + a[i] ==target && i != j)
                {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[0];
    } 
    
}
