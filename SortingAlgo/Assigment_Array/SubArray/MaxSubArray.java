package Assigment_Array.SubArray;

import java.util.*;

public class MaxSubArray {

    public static void main(String[] args) {
        int a[] = {2, -3, 4, 7, 8, 1};
        int MaxSub = maxsubarray(a);
        System.out.println(MaxSub);

        int MaxSub1 = maxsubarray1(a);
        System.out.println(MaxSub1);
    }

    public static int maxsubarray(int[] a)
    {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++)
        {
            int sum = 0;
            for(int j = i;j < n;j++)
            { 
                sum += a[j];                    
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static int maxsubarray1(int[] a)
    {
        int n = a.length;
        int coundSum = a[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1;i < n;i++)
        {
          coundSum = Math.max(a[i], coundSum + a[i]);
          max = Math.max(max, coundSum);
        }
        return max;
    }
}
