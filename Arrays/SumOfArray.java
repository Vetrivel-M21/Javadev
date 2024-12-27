import java.util.Arrays;

public class SumOfArray 
{
    public static void main(String[] args) {
        int [] a = {12, 34, 43, 55, 9, 46};
        System.out.println(Arrays.toString(a));
        int sum = sumarray(a);
        System.out.println(sum);
    }
    public static int sumarray(int [] a)
    {
        int sum =0;
        for(int i =0; i<a.length; i++)
        {
            sum += a[i];
        }
        return sum;
    }
}
