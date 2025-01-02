
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 0, 1};

        System.out.println(Arrays.toString(a));
        int max =Findmax(a);

        int[] b = new int[max+1];

        int [] c = Repeat(a, b);

        System.out.println(Arrays.toString(c));
        countingsort(a, c);
    }

    public static int Findmax(int[] a)
    {
        int max = 0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]> max)
            {
                max = a[i];
            }
        }
        return max;
    }
    
    public static int[] Repeat(int[] a, int[] b)
    {  
        for(int i = 0;i <a.length;i++ )
        {
            b[a[i]]++;
        }
        return b;
    }

    public static void countingsort(int[] a, int[] c)
    {   int j=0;
        for(int i =0; i < c.length; i++ )
        {
            while (c[i] > 0) {
                a[j] = i;
                j++;
                c[i]--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
