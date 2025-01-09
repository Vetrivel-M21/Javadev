package Assigment_Array.SubArray;

import java.util.*;
public class RemoveAndPrintDup {
    public static void main(String[] args) {
        int a[] = {2,4,5,6,3,4,7,8,9,8,2,7};
        int res[] = deleteDup(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] deleteDup(int a[])
    {
        int count =0;
        Arrays.sort(a);
        for(int i = 0,j=0;i < a.length-1;i++)
        {
            if(a[i] == a[i+1])
            {
                System.out.print(a[i]+" ");
                a[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        System.out.println();

        int rs[] = new int[a.length-count];
        for(int i=0, j=0;i<a.length;i++)
        {
            if(a[i] != Integer.MAX_VALUE)
                rs[j++] = a[i];

        }
        System.out.println(Arrays.toString(a));
        return rs;
    }
}
