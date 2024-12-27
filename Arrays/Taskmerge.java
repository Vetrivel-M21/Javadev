import java.util.Arrays;
public class Taskmerge {
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 6};
        int [] b = {2, 4};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] res = firstmerge(a, b);
        System.out.println(Arrays.toString(res));

        int[] res2 = secondmerge(a, b);
        System.out.println(Arrays.toString(res2));

        int[] res3 = secondformerge(a, b);
        System.out.println(Arrays.toString(res3));
    }

    public static int[] firstmerge(int [] x, int [] y)
    {
        int [] b = new int[x.length + y.length];
        for(int i=0, m=0, n=0; i<b.length; i++, m++)
        {
            if(m<x.length){
                b[i] = x[m];
            }
            else if(n<y.length)
            {
                b[i] = y[y.length-1-n];
                n++;   
            }
        }
        return b;
    }
    //using while loop
    public static int[] secondmerge(int [] x, int[] y)
    {
        int [] a =new int[x.length + y.length];
        int i = 0, m = 0, n = 0;
        while(m < x.length && n < y.length)
        {
            a[i++] = x[m++];
            a[i++] = y[n++];
        }

        while(m < x.length)
        {
            a[i++] = x[m++];
        }
        while(n< y.length)
        {
            a[i++] = y[n++];
        }
        return a;
    }
    //using for loop
    public static int[] secondformerge(int[] x, int[] y )
    {
        int[] b = new int[x.length + y.length];

        int m = 0 ,n = 0;
        for(int i = 0; i<b.length ;i++)
        {
            if(m < x.length && (n>= y.length || i % 2 ==0)){
                b[i] = x[m++];
            }
            else if (n < y.length )
            {
                b[i] = y[n++];
            }
        }
        return b;
    }
}
