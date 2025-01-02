import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {9, 3,-1, 4, 5, -8, 2, 1, 0};

        selectionsort(a);
    }

    public static void selectionsort(int[] a) {
        System.out.println(Arrays.toString(a));
        for(int i =0; i<a.length; i++)
        {
            int s=i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[s] > a[j])
                {
                    s = j;
                }
            }
            int temp = a[s];
            a[s] = a[i];
            a[i] = temp;

        }
        System.out.println(Arrays.toString(a));
        
    }
    
}
