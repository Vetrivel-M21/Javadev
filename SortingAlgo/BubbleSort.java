import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9,0,3,2,4,5,1};
        bubblesort(a);
    }

    public static void bubblesort(int[] a)
    {
        System.out.println(Arrays.toString(a));

        for(int i =0; i < a.length-1; i++)
        {
            for(int j =0;j < a.length-1; j++)
            {
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                 }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
