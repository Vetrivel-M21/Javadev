
import java.util.Arrays;
public class MergeArray {
      public static void main(String[] args) {
        int [] a = {1, 4, 5, 8, 2};
        int [] b = {45, 54, 29, 23};
        int [] res = merge(a, b);
        System.out.println(Arrays.toString(res));
      }    

      public static int[] merge(int [] x, int [] y)
      {
        int [] finalArray = new int[x.length + y.length];

        for(int i = 0, m=0, n=0; i < finalArray.length; i++)
        {
            if(m < x.length)
            {
                finalArray[i] = x[m];
                m++;
            }
            else if(n < y.length)
            {
                finalArray[i] = y[n];
                n++;
            }
        }
        return finalArray;
      }
}
