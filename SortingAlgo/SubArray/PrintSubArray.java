
import java.util.*;
public class PrintSubArray {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 7, 8, 1};
        subarray(a);
    }

    public static void subarray(int []a )
    {
        int n = a.length;
        for(int i = 0;i < n;i++)
        {
            for(int j = i;j < n;j++)
            {
                for(int k = i;k <= j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
