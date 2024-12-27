import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] a={9,8,6,3,2,5,1,4};
        System.out.println(Arrays.toString(a));
        insertionsort(a);
    }

    public static void insertionsort(int[] a)
    {   
        for(int i =0 ; i<a.length; i++)
        {
            int prev = i-1;
            int curr = a[i];

            while(prev >=0 && a[prev] > curr)
            {
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
        System.out.println(Arrays.toString(a));
    }
}
