import java.util.Arrays;

public class FindSum {
    public static void main(String[] args) {
        int[] a = {0, -1, 2, -2, 1, 4 ,-2, 3};
        int target = -2;
        int target2 = -5;
        int target3 = 10;
        int[]  sum =findTwosum(a,target);
        System.out.println(target);
        System.out.println(Arrays.toString(sum));

        int[]  sum2 =findThreesum(a,target2);
        System.out.println(target2);
        System.out.println(Arrays.toString(sum2));

        int[]  sum3 =findFoursum(a,target3);
        System.out.println(target3);
        System.out.println(Arrays.toString(sum3));
    }

    public static int[] findTwosum(int[] a, int target)
    {
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++)
            {
                if(a[i] + a[j] == target)
                    return new int[] {i, j};
                    // return new int[] {a[i], a[j]};
                    
            }
        }
        return new int[0];
    }

    public static int[] findThreesum(int[] a, int target)
    {
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++)
            {
                for(int k =j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k] == target)
                    {
                         return new int[] {i, j, k};
                        // return new int[] {a[i], a[j], a[k]};
                    }
                }
            }
        }
        return new int[0];
    }

    public static int[] findFoursum(int[] a, int target)
    {
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++)
            {
                for(int k =j+1;k<n;k++)
                {
                   for(int l =k+1; l<n; l++)
                   {
                        if(a[i]+a[j]+a[k]+a[l] == target)
                        {
                            return new int[] {i, j, k, l};
                            // return new int[] {a[i], a[j], a[k], a[l]};
                        }
                   }
                }
            }
        }
        return new int[0];
    }

}
